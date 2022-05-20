package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.values.Horario;
import co.com.sofka.comercial.bodega.values.VigilanteId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Nombre;

public class Vigilante extends Entity<VigilanteId> {
    protected Nombre nombre;
    protected Horario horario;

    public Vigilante(VigilanteId entityId, Nombre nombre, Horario horario) {
        super(entityId);
        this.nombre = nombre;
        this.horario = horario;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public void actualizarHorario(Horario horario) {
        this.horario = horario;
    }
}
