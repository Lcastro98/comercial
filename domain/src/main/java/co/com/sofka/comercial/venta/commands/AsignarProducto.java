package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.*;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarProducto extends Command {

    private final VentaId ventaId;
    private final Nombre nombre;
    private final Talla talla;
    private final Color color;
    private final Precio precio;

    public AsignarProducto(VentaId VentaId, Nombre nombre, Talla talla, Color color, Precio precio){
        this.ventaId = VentaId;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Talla getTalla() {
        return talla;
    }

    public Color getColor() {
        return color;
    }

    public Precio getPrecio() {
        return precio;
    }
}
