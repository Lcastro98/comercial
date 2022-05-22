package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.Caja;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarCajero extends Command {
    private final TiendaId tiendaId;
    private final Nombre nombre;
    private final Caja caja;

    public AsignarCajero(TiendaId tiendaId, Nombre nombre, Caja caja) {
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        this.caja = caja;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Caja getCaja() {
        return caja;
    }
}
