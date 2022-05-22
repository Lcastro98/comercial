package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.tienda.commands.AsignarEncargado;
import co.com.sofka.comercial.tienda.events.EncargadoAsignado;
import co.com.sofka.comercial.tienda.events.TiendaCreada;
import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.tienda.values.Ubicacion;
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
class AsignarEncargadoUseCaseTest {
    @InjectMocks
    AsignarEncargadoUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void asignarEncargadoHappyPass(){
        var tiendaId = TiendaId.of("cccc");
        var nombre = new Nombre("Lorena", "Castro");
        var metaMensual = new MetaMensual("Superar los 10,000,000 en ventas");
        var command = new AsignarEncargado(tiendaId, nombre, metaMensual);

        when(repository.getEventsBy("cccc")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getTiendaId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (EncargadoAsignado)events.get(0);
        Assertions.assertEquals("Lorena", event.getNombre().value().nombre());
        Assertions.assertEquals("Castro", event.getNombre().value().apellido());
        Assertions.assertEquals("Superar los 10,000,000 en ventas", event.getMetaMensual().value());
    }

    private List<DomainEvent> history() {
        var ubicacion = new Ubicacion("Cll tal # tal-tal", "Cúcuta", "Colombia");
        var event = new TiendaCreada(
                ubicacion);
        event.setAggregateRootId("cccc");
        return List.of(event);
    }

}