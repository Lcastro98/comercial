package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.bodega.Despacho;
import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class DespachoSolicitado extends DomainEvent {
    private final Ubicacion ubicacion;
    private final BodegaId bodegaId;

    public DespachoSolicitado(Ubicacion ubicacion, BodegaId bodegaId) {
        super("co.com.sofka.comercial.ListaDeVentasActualizado");
        this.ubicacion = ubicacion;
        this.bodegaId = bodegaId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }
}
