package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.tienda.commands.CrearTienda;
import co.com.sofka.comercial.tienda.events.TiendaCreada;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.tienda.values.Ubicacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrearTiendaUseCaseTest {
    private CrearTiendaUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CrearTiendaUseCase();
    }

    @Test
    public void crearTiendaHappyPass() {
        //arrange
        var tiendaId = TiendaId.of("cccc");
        var ubicacion = new Ubicacion("Cll tal # tal-tal", "Cúcuta", "Colombia");
        var command = new CrearTienda(tiendaId, ubicacion);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var tiendaCreada = (TiendaCreada) events.get(0);
        Assertions.assertEquals("cccc", tiendaCreada.aggregateRootId());
        Assertions.assertEquals("Cll tal # tal-tal", tiendaCreada.getUbicacion().value().direccion());
        Assertions.assertEquals("Cúcuta", tiendaCreada.getUbicacion().value().ciudad());
        Assertions.assertEquals("Colombia", tiendaCreada.getUbicacion().value().pais());
    }
}