package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.Cliente;
import co.com.sofka.comercial.venta.Cupon;
import co.com.sofka.comercial.venta.Producto;
import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Fecha;

import java.util.List;

public class CrearVenta extends Command {
    private final VentaId ventaId;
    private final Cliente cliente;
    private final List<Producto> productos;
    private final Cupon cupon;
    private final Fecha fecha;
    private final Total total;

    public CrearVenta(VentaId ventaId, Cliente cliente, List<Producto> productos, Cupon cupon, Fecha fecha, Total total){
        this.ventaId = ventaId;
        this.cliente = cliente;
        this.productos = productos;
        this.cupon = cupon;
        this.fecha = fecha;
        this.total = total;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cupon getCupon() {
        return cupon;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Total getTotal() {
        return total;
    }
}
