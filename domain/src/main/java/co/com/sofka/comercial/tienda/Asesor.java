package co.com.sofka.comercial.tienda;

import co.com.sofka.comercial.tienda.values.AsesorId;
import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.comercial.tienda.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Asesor extends Entity<AsesorId> {
    protected Nombre nombre;
    protected Comision comision;

    public Asesor(AsesorId entityId, Nombre nombre, Comision comision) {
        super(entityId);
        this.nombre = nombre;
        this.comision = comision;
    }
}
