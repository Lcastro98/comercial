package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.DespachoId;
import co.com.sofka.comercial.bodega.values.Destino;
import co.com.sofka.generic.values.Fecha;

public class ActualizarDatosDespacho {
    private final DespachoId entityId;
    private final Fecha fecha;
    private final Destino destino;

    public ActualizarDatosDespacho(DespachoId entityId, Fecha fecha) {
        this.entityId = entityId;
        this.fecha = fecha;
        destino = null;
    }

    public ActualizarDatosDespacho(DespachoId entityId, Destino destino) {
        this.entityId = entityId;
        this.destino = destino;
        fecha = null;
    }

    public DespachoId getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Destino getDestino() {
        return destino;
    }
}
