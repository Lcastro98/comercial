package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.Descuento;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Fecha;

public class AsignarCupon extends Command {
    private final VentaId ventaId;
    private final Descuento descuento;
    private final Fecha fecha;

    public AsignarCupon(VentaId ventaId, Descuento descuento, Fecha fecha){
        this.ventaId = ventaId;
        this.descuento = descuento;
        this.fecha = fecha;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
