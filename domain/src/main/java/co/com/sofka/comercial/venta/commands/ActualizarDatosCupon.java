package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.Descuento;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Fecha;

public class ActualizarDatosCupon extends Command {
    private final VentaId ventaId;
    private final Descuento descuento;
    private final Fecha fecha;

    public ActualizarDatosCupon(VentaId ventaId, Descuento descuento){
        this.ventaId = ventaId;
        this.descuento = descuento;
        fecha = null;
    }

    public ActualizarDatosCupon(VentaId ventaId, Fecha fecha){
        this.ventaId = ventaId;
        this.fecha = fecha;
        descuento = null;
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
