package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.Color;
import co.com.sofka.comercial.venta.values.Talla;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class ActualizarDatosProducto extends Command {
    private final VentaId ventaId;
    private final Talla talla;
    private final Color color;

    public ActualizarDatosProducto(VentaId ventaId, Talla talla){
        this.ventaId = ventaId;
        this.talla = talla;
        color = null;
    }

    public ActualizarDatosProducto(VentaId ventaId, Color color){
        this.ventaId = ventaId;
        this.color = color;
        talla = null;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Talla getTalla() {
        return talla;
    }

    public Color getColor() {
        return color;
    }
}
