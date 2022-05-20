package co.com.sofka.comercial.venta.events;

import co.com.sofka.comercial.venta.values.ClienteId;
import co.com.sofka.comercial.venta.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class ClienteAsignado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteAsignado(ClienteId clienteId, Nombre nombre, Telefono telefono) {
        super("co.com.sofka.comercial.ClienteAsignado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
