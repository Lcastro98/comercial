package co.com.sofka.comercial.venta;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.comercial.venta.commands.CrearVenta;
import co.com.sofka.comercial.venta.events.VentaCreada;
import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.generic.values.Fecha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CrearVentaUseCaseTest {
    private CrearVentaUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearVentaUseCase();
    }

    @Test
    public void crearVentaHappyPass(){
        //arrange
        var ventaId = VentaId.of("bbbb");
        var fecha = new Fecha(LocalDateTime.of(2022, 05, 20, 8, 19));
        var total = new Total(20000D);
        var command = new CrearVenta(ventaId, fecha, total);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var ventaCreada = (VentaCreada)events.get(0);
        Assertions.assertEquals("bbbb", ventaCreada.aggregateRootId());
        Assertions.assertEquals(LocalDateTime.of(2022, 05, 20, 8, 19), ventaCreada.getFecha().value());
        Assertions.assertEquals(20000D, ventaCreada.getTotal().value());
    }

}