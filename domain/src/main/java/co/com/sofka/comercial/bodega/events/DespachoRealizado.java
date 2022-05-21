package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.Despacho;
import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class DespachoRealizado extends DomainEvent {
    private final Ubicacion ubicacion;

    public DespachoRealizado(Ubicacion ubicacion) {
        super("co.com.sofka.comercial.ListaDeVentasActualizado");
        this.ubicacion = ubicacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
