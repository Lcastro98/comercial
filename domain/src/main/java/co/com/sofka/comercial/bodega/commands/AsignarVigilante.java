package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarVigilante extends Command {
    private final BodegaId bodegaId;
    private final Nombre nombre;
    private final Horario horario;

    public AsignarVigilante(BodegaId bodegaId, Nombre nombre, Horario horario){
        this.bodegaId = bodegaId;
        this.nombre = nombre;
        this.horario = horario;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Horario getHorario() {
        return horario;
    }
}
