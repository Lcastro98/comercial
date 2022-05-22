package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.comercial.tienda.events.TotalVentasActualizado;
import co.com.sofka.comercial.tienda.events.TiendaCreada;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.comercial.venta.events.VentaRegistrada;
import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarTotalVentasUseCaseTest {
    @InjectMocks
    ActualizarTotalVentasUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarListaDeVentasHappyPass() {
        //arrange
        var event = new VentaRegistrada(new Total(100000D), TiendaId.of("cccc"));

        when(repository.getEventsBy("cccc")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var totalVentasActualizado = (TotalVentasActualizado) events.get(0);
        Assertions.assertEquals(100000D, totalVentasActualizado.getTotalVentas().value());
    }

    private List<DomainEvent> history() {
        var ubicacion = new Ubicacion("Cll tal # tal-tal", "Cúcuta", "Colombia");
        var event = new TiendaCreada(
                ubicacion);
        return List.of(event);
    }
}