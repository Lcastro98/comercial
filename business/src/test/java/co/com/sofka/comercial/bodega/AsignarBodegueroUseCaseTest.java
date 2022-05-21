package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.bodega.commands.AsignarBodeguero;
import co.com.sofka.comercial.bodega.events.BodegaCreada;
import co.com.sofka.comercial.bodega.events.BodegueroAsignado;
import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Dimension;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AsignarBodegueroUseCaseTest {
    @InjectMocks
    private AsignarBodegueroUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void asignarBodegueroHappyPass(){
        //arrange
        var bodegaId = BodegaId.of("xxxx");
        var nombre = new Nombre("Felipe", "Castro");
        var salario = new Salario("$",1500000D);
        var command = new AsignarBodeguero(bodegaId, nombre, salario);

        when(repository.getEventsBy("xxxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getBodegaId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (BodegueroAsignado)events.get(0);
        Assertions.assertEquals("Felipe", event.getNombre().value().nombre());
        Assertions.assertEquals("Castro", event.getNombre().value().apellido());
        Assertions.assertEquals(1500000D+"$", event.getSalario().value());
    }

    private List<DomainEvent> history() {
        var dimension = new Dimension(2.8F, 2.5F, 2.8F);
        var event = new BodegaCreada(
                dimension);
        event.setAggregateRootId("xxxx");
        return List.of(event);
    }

}