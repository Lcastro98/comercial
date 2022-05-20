package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.comercial.bodega.values.VigilanteId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class VigilanteAsignado extends DomainEvent {
    private final VigilanteId vigilanteId;
    private final Nombre nombre;
    private final Horario horario;

    public VigilanteAsignado(VigilanteId vigilanteId, Nombre nombre, Horario horario) {
        super("co.com.sofka.comercial.VigilanteAsignado");
        this.vigilanteId = vigilanteId;
        this.nombre = nombre;
        this.horario = horario;
    }

    public VigilanteId getVigilanteId() {
        return vigilanteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Horario getHorario() {
        return horario;
    }
}
