package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.bodega.commands.CrearBodega;
import co.com.sofka.comercial.bodega.events.BodegaCreada;
import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Dimension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrearBodegaUseCaseTest {
    private CrearBodegaUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearBodegaUseCase();
    }

    @Test
    public void crearBodegaHappyPass(){
        //arrange
        var bodegaId = BodegaId.of("xxxx");
        var dimension = new Dimension(2.8F, 2.5F, 2.8F);
        var command = new CrearBodega(bodegaId, dimension);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var bodegaCreada = (BodegaCreada)events.get(0);
        Assertions.assertEquals("xxxx", bodegaCreada.aggregateRootId());
        Assertions.assertEquals(2.8F, bodegaCreada.getDimension().value().largo());
        Assertions.assertEquals(2.5F, bodegaCreada.getDimension().value().alto());
        Assertions.assertEquals(2.8F, bodegaCreada.getDimension().value().ancho());
    }

}