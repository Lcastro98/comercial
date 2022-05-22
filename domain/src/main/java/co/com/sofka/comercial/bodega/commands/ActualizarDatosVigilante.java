package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.comercial.bodega.values.VigilanteId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosVigilante extends Command {
    private final BodegaId bodegaId;
    private final VigilanteId entityId;
    private final Nombre nombre;
    private final Horario horario;

    public ActualizarDatosVigilante(BodegaId bodegaId, VigilanteId entityId, Nombre nombre) {
        this.bodegaId = bodegaId;
        this.entityId = entityId;
        this.nombre = nombre;
        horario = null;
    }

    public ActualizarDatosVigilante(BodegaId bodegaId, VigilanteId entityId, Horario horario) {
        this.bodegaId = bodegaId;
        this.entityId = entityId;
        this.horario = horario;
        nombre = null;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
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
