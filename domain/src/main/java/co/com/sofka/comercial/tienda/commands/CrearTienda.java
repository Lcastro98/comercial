package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.Asesor;
import co.com.sofka.comercial.tienda.Cajero;
import co.com.sofka.comercial.tienda.Encargado;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;

public class CrearTienda extends Command {

    private final TiendaId tiendaId;
    private final Encargado encargado;
    private final Asesor asesor;
    private final Cajero cajero;

    public CrearTienda(TiendaId tiendaId, Encargado encargado, Asesor asesor, Cajero cajero) {
        this.tiendaId = tiendaId;
        this.encargado = encargado;
        this.asesor = asesor;
        this.cajero = cajero;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public Cajero getCajero() {
        return cajero;
    }
}
