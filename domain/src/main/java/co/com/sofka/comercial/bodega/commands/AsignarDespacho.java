package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.DespachoId;
import co.com.sofka.comercial.bodega.values.Destino;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Fecha;

public class AsignarDespacho extends Command {
    private final DespachoId despachoId;
    private final Fecha fecha;
    private final Destino destino;

    public AsignarDespacho(DespachoId despachoId, Fecha fecha, Destino destino) {
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
