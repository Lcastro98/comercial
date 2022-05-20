package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class TiendaCreada extends DomainEvent {
    private final Ubicacion ubicacion;

    public TiendaCreada(Ubicacion ubicacion) {
        super("co.com.sofka.comercial.TiendaCreada");
        this.ubicacion = ubicacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
