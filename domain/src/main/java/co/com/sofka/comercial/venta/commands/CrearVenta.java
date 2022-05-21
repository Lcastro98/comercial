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
    private final Fecha fecha;
    private final Total total;

    public CrearVenta(VentaId ventaId, Fecha fecha, Total total){
        this.ventaId = ventaId;
        this.fecha = fecha;
        this.total = total;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Total getTotal() {
        return total;
    }
}
