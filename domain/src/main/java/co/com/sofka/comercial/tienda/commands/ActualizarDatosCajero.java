package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.tienda.values.Caja;
import co.com.sofka.comercial.tienda.values.CajeroId;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosCajero extends Command {
    private final TiendaId tiendaId;
    private final CajeroId entityId;
    private final Nombre nombre;
    private final Caja caja;

    public ActualizarDatosCajero(TiendaId tiendaId, CajeroId entityId, Nombre nombre) {
        this.tiendaId = tiendaId;
        this.entityId = entityId;
        this.nombre = nombre;
        caja = null;
    }

    public ActualizarDatosCajero(TiendaId tiendaId, CajeroId entityId, Caja caja) {
        this.tiendaId = tiendaId;
        this.entityId = entityId;
        this.caja = caja;
        nombre = null;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public CajeroId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Caja getCaja() {
        return caja;
    }
}
