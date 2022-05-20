package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.values.AsesorId;
import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class AsesorAsignado extends DomainEvent {
    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Comision comision;

    public AsesorAsignado(AsesorId asesorId, Nombre nombre, Comision comision) {
        super("co.com.sofka.comercial.AsesorAsignado");
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.comision = comision;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Comision getComision() {
        return comision;
    }
}
