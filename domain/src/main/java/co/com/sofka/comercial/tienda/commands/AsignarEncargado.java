package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarEncargado extends Command {
    private final TiendaId tiendaId;
    private final Nombre nombre;
    private final MetaMensual metaMensual;

    public AsignarEncargado(TiendaId tiendaId, Nombre nombre, MetaMensual metaMensual){
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        this.metaMensual = metaMensual;
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
