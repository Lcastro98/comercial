package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosAsesor extends Command {
    private final TiendaId tiendaId;
    private final Nombre nombre;
    private final Comision comision;

    public ActualizarDatosAsesor(TiendaId tiendaId, Nombre nombre) {
        this.tiendaId = tiendaId;
        this.nombre = nombre;
        comision = null;
    }

    public ActualizarDatosAsesor(TiendaId tiendaId, Comision comision) {
        this.tiendaId = tiendaId;
        this.comision = comision;
        nombre = null;
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
