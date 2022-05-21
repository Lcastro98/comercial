package co.com.sofka.comercial.venta;

import co.com.sofka.comercial.venta.events.ClienteAsignado;
import co.com.sofka.comercial.venta.events.CuponAsignado;
import co.com.sofka.comercial.venta.events.ProductoAgregado;
import co.com.sofka.comercial.venta.events.VentaCreada;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.generic.values.Nombre;

public class VentaEventChange extends EventChange {
    public VentaEventChange(Venta venta) {
        apply((VentaCreada event) -> {
            venta.fecha = event.getFecha();
            venta.total = event.getTotal();
        });

        apply((ClienteAsignado event) -> {
            venta.cliente.nombre = (Nombre) event.getNombre().value();
            venta.cliente.telefono = event.getTelefono();
        });

        apply((ProductoAgregado event) -> {
            var producto = new Producto(event.getProductoId(), event.getNombre(), event.getTalla(), event.getColor(), event.getPrecio());
            venta.productos.add(producto);
        });

        apply((CuponAsignado event) -> {
            venta.cupon.descuento = event.getDescuento();
            venta.cupon.fecha = event.getFecha();
        });

        apply((VentaRegistrada event) -> {
            venta.total = event.getTotal();
        });
    }
}
