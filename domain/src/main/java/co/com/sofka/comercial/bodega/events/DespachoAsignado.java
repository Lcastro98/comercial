package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.DespachoId;
import co.com.sofka.comercial.bodega.values.Destino;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;

public class DespachoAsignado extends DomainEvent {
    private final DespachoId despachoId;
    private final Fecha fecha;
    private final Destino destino;

    public DespachoAsignado(DespachoId despachoId, Fecha fecha, Destino destino) {
        super("co.com.sofka.comercial.DespachoAsignado");
        this.despachoId = despachoId;
        this.fecha = fecha;
        this.destino = destino;
    }

    public DespachoId getDespachoId() {
        return despachoId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Destino getDestino() {
        return destino;
    }
}
