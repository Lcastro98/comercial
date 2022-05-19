package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.values.DespachoId;
import co.com.sofka.comercial.bodega.values.Destino;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generic.values.Fecha;

public class Despacho extends Entity<DespachoId> {
    protected Fecha fecha;
    protected Destino destino;

    public Despacho(DespachoId entityId, Fecha fecha, Destino destino) {
        super(entityId);
        this.fecha = fecha;
        this.destino = destino;
    }
}
