package co.com.sofka.comercial.tienda;

import co.com.sofka.comercial.tienda.values.Caja;
import co.com.sofka.comercial.tienda.values.CajeroId;
import co.com.sofka.generic.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Cajero extends Entity<CajeroId> {
    protected Nombre nombre;
    protected Caja caja;

    public Cajero(CajeroId entityId, Nombre nombre, Caja caja) {
        super(entityId);
        this.nombre = nombre;
        this.caja = caja;
    }
}
