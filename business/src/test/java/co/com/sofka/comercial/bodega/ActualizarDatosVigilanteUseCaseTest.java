package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.bodega.commands.ActualizarDatosBodeguero;
import co.com.sofka.comercial.bodega.commands.ActualizarDatosVigilante;
import co.com.sofka.comercial.bodega.events.*;
import co.com.sofka.comercial.bodega.values.*;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarDatosVigilanteUseCaseTest {
    @InjectMocks
    ActualizarDatosVigilanteUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarDatosVigilanteHappyPass() {
        //arrange
        var bodegaId = BodegaId.of("xxxx");
        var entityId = VigilanteId.of("0");
        var nombre = new Nombre(  "Marta", "Gallego");
        var command = new ActualizarDatosVigilante(bodegaId, entityId, nombre);

        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getBodegaId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (VigilanteActualizado)events.get(0);
        Assertions.assertEquals(command.getNombre(), event.getNombre());
    }

    private List<DomainEvent> history() {
        var dimension = new Dimension(2.8F, 2.5F, 2.8F);
        var event = new BodegaCreada(dimension);
        event.setAggregateRootId("xxxx");

        var vigilanteId = VigilanteId.of("0");
        var nombre = new Nombre("Ernesto", "Perez");
        var horario = new Horario(LocalDateTime.of(2022, 05, 21, 8, 0), LocalDateTime.of(2022, 05, 21, 18, 0));
        var event2 = new VigilanteAsignado(vigilanteId, nombre, horario);

        return List.of(event, event2);
    }

}