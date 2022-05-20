package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.comercial.bodega.values.VigilanteId;
import co.com.sofka.generic.values.Nombre;

public class AsignarVigilante {
    private final VigilanteId vigilanteId;
    private final Nombre nombre;
    private final Horario horario;

    public AsignarVigilante(VigilanteId vigilanteId, Nombre nombre, Horario horario){
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
