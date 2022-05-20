package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.values.EncargadoId;
import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class EncargadoActualizado extends DomainEvent {
    private final EncargadoId entityId;
    private final Nombre nombre;
    private final MetaMensual metaMensual;

    public EncargadoActualizado(EncargadoId entityId, Nombre nombre) {
        super("co.com.sofka.comercial.EncargadoActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        metaMensual = null;
    }

    public EncargadoActualizado(EncargadoId entityId, MetaMensual metaMensual) {
        super("co.com.sofka.comercial.EncargadoActualizado");
        this.entityId = entityId;
        this.metaMensual = metaMensual;
        nombre = null;
    }

    public EncargadoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public MetaMensual getMetaMensual() {
        return metaMensual;
    }
}
