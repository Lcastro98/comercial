package co.com.sofka.comercial.venta.commands;

import co.com.sofka.comercial.venta.values.ClienteId;
import co.com.sofka.comercial.venta.values.Telefono;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosCliente extends Command {
    private final VentaId ventaId;
    private final ClienteId entityId;
    private final Telefono telefono;
    private final Nombre nombre;

    public ActualizarDatosCliente(VentaId ventaId, ClienteId entityId, Nombre nombre) {
        this.ventaId = ventaId;
        this.entityId = entityId;
        this.nombre = nombre;
        telefono = null;
    }

    public ActualizarDatosCliente(VentaId ventaId, ClienteId entityId, Telefono telefono) {
        this.ventaId = ventaId;
        this.entityId = entityId;
        this.telefono = telefono;
        nombre = null;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
