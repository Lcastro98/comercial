package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.Asesor;
import co.com.sofka.comercial.tienda.Cajero;
import co.com.sofka.comercial.tienda.Encargado;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.domain.generic.Command;

public class CrearTienda extends Command {

    private final TiendaId tiendaId;
    private final Ubicacion ubicacion;

    public CrearTienda(TiendaId tiendaId, Ubicacion ubicacion) {
        this.tiendaId = tiendaId;
        this.ubicacion = ubicacion;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
