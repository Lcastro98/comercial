package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.bodega.commands.AsignarVigilante;
import co.com.sofka.comercial.bodega.events.BodegaCreada;
import co.com.sofka.comercial.bodega.events.BodegueroAsignado;
import co.com.sofka.comercial.bodega.events.VigilanteAsignado;
import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Dimension;
import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AsignarVigilanteUseCaseTest {
    @InjectMocks
    AsignarVigilanteUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void asignarVigilanteHappyPass(){
        //arrange
        var bodegaId = BodegaId.of("xxxx");
        var nombre = new Nombre("Ernesto", "Perez");
        var horario = new Horario(LocalDateTime.of(2022, 05, 21, 8, 0), LocalDateTime.of(2022, 05, 21, 18, 0));
        var command = new AsignarVigilante(bodegaId, nombre, horario);

        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getBodegaId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (VigilanteAsignado)events.get(0);
        var horaInicio = LocalDateTime.of(2022, 05, 21, 8, 0);
        var horaFin = LocalDateTime.of(2022, 05, 21, 18, 0);
        Assertions.assertEquals("Ernesto", event.getNombre().value().nombre());
        Assertions.assertEquals("Perez", event.getNombre().value().apellido());
        Assertions.assertEquals(horaInicio, event.getHorario().value().horaInicio());
        Assertions.assertEquals(horaFin, event.getHorario().value().horaFin());
    }

    private List<DomainEvent> history() {
        var dimension = new Dimension(2.8F, 2.5F, 2.8F);
        var event = new BodegaCreada(
                dimension);
        event.setAggregateRootId("xxxx");
        return List.of(event);
    }

}