package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.DespachoId;
import co.com.sofka.comercial.bodega.values.Destino;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;

public class DespachoActualizado extends DomainEvent {
    private final DespachoId entityId;
    private final Fecha fecha;
    private final Destino destino;

    public DespachoActualizado(DespachoId entityId, Fecha fecha) {
        super("co.com.sofka.comercial.DespachoActualizado");
        this.entityId = entityId;
        this.fecha = fecha;
        destino = null;
    }

    public DespachoActualizado(DespachoId entityId, Destino destino) {
        super("co.com.sofka.comercial.DespachoActualizado");
        this.entityId = entityId;
        this.destino = destino;
        fecha = null;
    }

    public DespachoId getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Destino getDestino() {
        return destino;
    }
}
