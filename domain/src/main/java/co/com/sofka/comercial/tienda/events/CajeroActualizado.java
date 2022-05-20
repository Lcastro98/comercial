package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.events.CajeroAsignado;
import co.com.sofka.comercial.tienda.values.Caja;
import co.com.sofka.comercial.tienda.values.CajeroId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class CajeroActualizado extends DomainEvent {
    private final CajeroId entityId;
    private final Nombre nombre;
    private final Caja caja;

    public CajeroActualizado(CajeroId entityId, Nombre nombre) {
        super("co.com.sofka.comercial.CajeroActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        caja = null;
    }

    public CajeroActualizado(CajeroId entityId, Caja caja) {
        super("co.com.sofka.comercial.CajeroActualizado");
        this.entityId = entityId;
        this.caja = caja;
        nombre = null;
    }

    public CajeroId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Caja getCaja() {
        return caja;
    }
}
