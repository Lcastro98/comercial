package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.values.AsesorId;
import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class AsesorActualizado extends DomainEvent {
    private final AsesorId entityId;
    private final Nombre nombre;
    private final Comision comision;

    public AsesorActualizado(AsesorId entityId, Nombre nombre) {
        super("co.com.sofka.comercial.AsesorActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        comision = null;
    }

    public AsesorActualizado(AsesorId entityId, Comision comision) {
        super("co.com.sofka.comercial.AsesorActualizado");
        this.entityId = entityId;
        nombre = null;
        this.comision = comision;
    }

    public AsesorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Comision getComision() {
        return comision;
    }
}
