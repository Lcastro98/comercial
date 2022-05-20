package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.comercial.bodega.values.VigilanteId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class VigilanteActualizado extends DomainEvent {
    private final VigilanteId entityId;
    private final Nombre nombre;
    private final Horario horario;

    public VigilanteActualizado(VigilanteId entityId, Nombre nombre) {
        super("co.com.sofka.comercial.VigilanteActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        horario = null;
    }

    public VigilanteActualizado(VigilanteId entityId, Horario horario) {
        super("co.com.sofka.comercial.VigilanteActualizado");
        this.entityId = entityId;
        this.horario = horario;
        nombre = null;
    }

    public VigilanteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Horario getHorario() {
        return horario;
    }
}
