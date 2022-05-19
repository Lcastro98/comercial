package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.values.BodegueroId;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Nombre;

public class Bodeguero extends Entity<BodegueroId> {
    protected Nombre nombre;
    protected Salario salario;

    public Bodeguero(BodegueroId entityId, Nombre nombre, Salario salario) {
        super(entityId);
        this.nombre = nombre;
        this.salario = salario;
    }
}
