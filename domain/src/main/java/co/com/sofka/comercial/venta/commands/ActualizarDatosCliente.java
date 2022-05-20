package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.Telefono;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosCliente extends Command {
    private final VentaId ventaId;
    private final Telefono telefono;
    private final Nombre nombre;

    public ActualizarDatosCliente(VentaId ventaId, Nombre nombre){
        this.ventaId = ventaId;
        this.nombre = nombre;
        telefono = null;
    }

    public ActualizarDatosCliente(VentaId ventaId, Telefono telefono){
        this.ventaId = ventaId;
        this.telefono = telefono;
        nombre = null;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
