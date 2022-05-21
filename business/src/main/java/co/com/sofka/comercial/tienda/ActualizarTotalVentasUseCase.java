package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.comercial.venta.VentaRegistrada;

public class ActualizarTotalVentasUseCase extends UseCase<TriggeredEvent<VentaRegistrada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<VentaRegistrada> ventaRealizadaTriggeredEvent) {
        var event = ventaRealizadaTriggeredEvent.getDomainEvent();
        var tienda = Tienda.from(
                event.getTiendaId(),
                repository().getEventsBy(event.getTiendaId().value()));

        tienda.actualizarTotalVentas(event.getTotal());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
