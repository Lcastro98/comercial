package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarEncargado extends Command {
    private final TiendaId tiendaId;
    private final Nombre nombre;
    private final Comision comision;

    public AsignarEncargado(TiendaId tiendaId, Nombre nombre, Comision comision){
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        this.comision = comision;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Comision getComision() {
        return comision;
    }
}
