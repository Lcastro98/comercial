package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.comercial.bodega.values.VigilanteId;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosVigilante {
    private final VigilanteId entityId;
    private final Nombre nombre;
    private final Horario horario;

    public ActualizarDatosVigilante(VigilanteId entityId, Nombre nombre){
        this.entityId = entityId;
        this.nombre = nombre;
        horario = null;
    }

    public ActualizarDatosVigilante(VigilanteId entityId, Horario horario){
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
