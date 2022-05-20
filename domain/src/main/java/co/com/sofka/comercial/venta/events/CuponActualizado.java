package co.com.sofka.comercial.venta.events;

import co.com.sofka.comercial.venta.values.CuponId;
import co.com.sofka.comercial.venta.values.Descuento;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;

public class CuponActualizado extends DomainEvent {
    private final CuponId entityId;
    private final Descuento descuento;
    private final Fecha fecha;

    public CuponActualizado(CuponId entityId, Descuento descuento) {
        super("co.com.sofka.comercial.CuponActualizado");
        this.entityId = entityId;
        this.descuento = descuento;
        fecha = null;
    }

    public CuponActualizado(CuponId entityId, Fecha fecha) {
        super("co.com.sofka.comercial.CuponActualizado");
        this.entityId = entityId;
        this.fecha = fecha;
        descuento = null;
    }

    public CuponId getEntityId() {
        return entityId;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
