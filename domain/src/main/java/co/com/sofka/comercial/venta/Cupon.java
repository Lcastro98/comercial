package co.com.sofka.comercial.venta;

import co.com.sofka.comercial.venta.values.CuponId;
import co.com.sofka.comercial.venta.values.Descuento;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Fecha;

public class Cupon extends Entity<CuponId> {
    protected Descuento descuento;
    protected Fecha fecha;

    public Cupon(CuponId entityId) {
        super(entityId);
    }
}
