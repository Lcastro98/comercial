package co.com.sofka.comercial.venta;

import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.generic.values.Fecha;

public class Venta extends AggregateEvent<VentaId> {
    protected Cliente cliente;
    protected Producto producto;
    protected Cupon cupon;
    protected Fecha fecha;
    protected Total total;

    public Venta(VentaId entityId) {
        super(entityId);
    }
}
