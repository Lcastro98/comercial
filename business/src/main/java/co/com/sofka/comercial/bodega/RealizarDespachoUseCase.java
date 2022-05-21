package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.comercial.tienda.events.DespachoSolicitado;

public class RealizarDespachoUseCase extends UseCase<TriggeredEvent<DespachoSolicitado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<DespachoSolicitado> despachoSolicitadoTriggeredEvent) {
        var event = despachoSolicitadoTriggeredEvent.getDomainEvent();
        var bodega = Bodega.from(
                event.getBodegaId(),
                repository().getEventsBy(event.getBodegaId().value()));

        bodega.realizarDespacho(event.getUbicacion());

        emit().onResponse(new ResponseEvents(bodega.getUncommittedChanges()));
    }
}
