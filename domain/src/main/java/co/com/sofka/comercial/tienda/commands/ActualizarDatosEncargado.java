package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.EncargadoId;
import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosEncargado extends Command {
    private final TiendaId tiendaId;
    private final EncargadoId entityId;
    private final Nombre nombre;
    private final MetaMensual metaMensual;

    public ActualizarDatosEncargado(TiendaId tiendaId, EncargadoId entityId, Nombre nombre) {
        this.tiendaId = tiendaId;
        this.entityId = entityId;
        this.nombre = nombre;
        metaMensual = null;
    }

    public ActualizarDatosEncargado(TiendaId tiendaId, EncargadoId entityId, MetaMensual metaMensual) {
        this.tiendaId = tiendaId;
        this.entityId = entityId;
        this.metaMensual = metaMensual;
        nombre = null;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
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
