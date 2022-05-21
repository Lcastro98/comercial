package co.com.sofka.comercial.venta.events;

import co.com.sofka.comercial.venta.values.ClienteId;
import co.com.sofka.comercial.venta.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class ClienteActualizado extends DomainEvent {
    private final ClienteId entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteActualizado(ClienteId entityId, Nombre nombre) {
        super("co.com.sofka.comercial.ClienteActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        telefono = null;
    }

    public ClienteActualizado(ClienteId entityId, Telefono telefono) {
        super("co.com.sofka.comercial.ClienteActualizado");
        this.entityId = entityId;
        this.telefono = telefono;
        nombre = null;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
