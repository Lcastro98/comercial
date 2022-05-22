package co.com.sofka.comercial.venta;

import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.venta.events.*;
import co.com.sofka.comercial.venta.values.*;
import co.com.sofka.comercial.venta.values.Color;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;
import co.com.sofka.generic.values.Nombre;

import java.util.List;
import java.util.Objects;

public class Venta extends AggregateEvent<VentaId> {
    protected TiendaId tiendaId;
    protected Cliente cliente;
    protected List<Producto> productos;
    protected Cupon cupon;
    protected Fecha fecha;
    protected Total total;

    public Venta(TiendaId tiendaId, VentaId entityId, Fecha fecha, Total total) {
        super(entityId);
        appendChange(new VentaCreada(tiendaId, fecha, total)).apply();
        subscribe(new VentaEventChange(this));
    }

    private Venta(VentaId entityId) {
        super(entityId);
        subscribe(new VentaEventChange(this));
    }

    public static Venta from(VentaId entityId, List<DomainEvent> events) {
        var venta = new Venta(entityId);
        events.forEach(venta::applyEvent);
        return venta;
    }

    public void asignarCliente(Nombre nombre, Telefono telefono) {
        var clienteId = new ClienteId();
        appendChange(new ClienteAsignado(clienteId, nombre, telefono)).apply();
    }

    public void agregarProducto(Nombre nombre, Talla talla, Color color, Precio precio) {
        var productoId = new ProductoId();
        appendChange(new ProductoAgregado(productoId, nombre, talla, color, precio)).apply();
    }

    public void asignarCupon(Descuento descuento, Fecha fecha) {
        var cuponId = new CuponId();
        appendChange(new CuponAsignado(cuponId, descuento, fecha)).apply();
    }

    public void actualizarDatosCliente(ClienteId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new ClienteActualizado(entityId, nombre)).apply();
    }

    public void actualizarDatosCliente(ClienteId entityId, Telefono telefono) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(telefono);
        appendChange(new ClienteActualizado(entityId, telefono)).apply();
    }

    public void actualizarDatosProducto(ProductoId entityId, Talla talla) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(talla);
        appendChange(new ProductoActualizado(entityId, talla)).apply();
    }

    public void actualizarDatosProducto(ProductoId entityId, Color color) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(color);
        appendChange(new ProductoActualizado(entityId, color)).apply();
    }

    public void actualizarDatosCupon(CuponId entityId, Descuento descuento) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descuento);
        appendChange(new CuponActualizado(entityId, descuento)).apply();
    }

    public void actualizarDatosCupon(CuponId entityId, Fecha fecha) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fecha);
        appendChange(new CuponActualizado(entityId, fecha)).apply();
    }

    public void registrarVenta(Total total) {
        appendChange(new VentaRegistrada(total, tiendaId)).apply();
    }

    public TiendaId tiendaId() {
        return tiendaId;
    }

    public Cliente cliente() {
        return cliente;
    }

    public List<Producto> productos() {
        return productos;
    }

    public Cupon cupon() {
        return cupon;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Total total() {
        return total;
    }
}
