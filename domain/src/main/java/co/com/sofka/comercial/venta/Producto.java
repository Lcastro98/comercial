package co.com.sofka.comercial.venta;

import co.com.sofka.comercial.venta.values.Color;
import co.com.sofka.comercial.venta.values.Precio;
import co.com.sofka.comercial.venta.values.ProductoId;
import co.com.sofka.comercial.venta.values.Talla;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Nombre;


public class Producto extends Entity<ProductoId> {
    protected Nombre nombre;
    protected Talla talla;
    protected Color color;
    protected Precio precio;

    public Producto(ProductoId entityId, Nombre nombre, Talla talla, Color color, Precio precio) {
        super(entityId);
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    public void actualizarTalla(Talla talla) {
        this.talla = talla;
    }

    public void actualizarColor(Color color) {
        this.color = color;
    }
}
