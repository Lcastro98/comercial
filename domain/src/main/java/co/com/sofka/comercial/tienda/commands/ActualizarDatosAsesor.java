package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.AsesorId;
import co.com.sofka.comercial.tienda.values.Comision;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosAsesor extends Command {
    private final TiendaId tiendaId;
    private final AsesorId entityId;
    private final Nombre nombre;
    private final Comision comision;

    public ActualizarDatosAsesor(TiendaId tiendaId, AsesorId entityId, Nombre nombre) {
        this.tiendaId = tiendaId;
        this.entityId = entityId;
        this.nombre = nombre;
        comision = null;
    }

    public ActualizarDatosAsesor(TiendaId tiendaId, AsesorId entityId, Comision comision) {
        this.tiendaId = tiendaId;
        this.entityId = entityId;
        this.comision = comision;
        nombre = null;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public AsesorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Comision getComision() {
        return comision;
    }
}
