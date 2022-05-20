package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.Dimension;
import co.com.sofka.domain.generic.DomainEvent;

public class BodegaCreada extends DomainEvent {
    private final Dimension dimension;

    public BodegaCreada(Dimension dimension) {
        super("co.com.sofka.comercial.BodegaCreada");
        this.dimension = dimension;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
