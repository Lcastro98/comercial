package co.com.sofka.comercial.venta.events;

import co.com.sofka.comercial.venta.values.CuponId;
import co.com.sofka.comercial.venta.values.Descuento;
import co.com.sofka.comercial.venta.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;
import co.com.sofka.generic.values.Nombre;

public class CuponAsignado extends DomainEvent {
    private final Descuento descuento;
    private final Fecha fecha;

    public CuponAsignado(CuponId cuponId, Descuento descuento, Fecha fecha) {
        super("co.com.sofka.comercial.CuponAsignado");
        this.descuento = descuento;
        this.fecha = fecha;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
