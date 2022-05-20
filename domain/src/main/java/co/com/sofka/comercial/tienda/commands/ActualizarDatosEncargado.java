package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosEncargado extends Command {
    private final TiendaId tiendaId;
    private final Nombre nombre;
    private final MetaMensual metaMensual;

    public ActualizarDatosEncargado(TiendaId tiendaId, Nombre nombre) {
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        metaMensual = null;
    }

    public ActualizarDatosEncargado(TiendaId tiendaId, MetaMensual metaMensual) {
        this.tiendaId = tiendaId;
        this.metaMensual = metaMensual;
        nombre = null;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public MetaMensual getMetaMensual() {
        return metaMensual;
    }
}
