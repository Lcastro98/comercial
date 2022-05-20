package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.ClienteId;
import co.com.sofka.comercial.venta.values.Telefono;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarCliente extends Command {

    private final VentaId ventaId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AsignarCliente(VentaId ventaId, Nombre nombre, Telefono telefono){
        this.ventaId = ventaId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
