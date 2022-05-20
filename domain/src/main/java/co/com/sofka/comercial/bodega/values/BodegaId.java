package co.com.sofka.comercial.bodega.values;

import co.com.sofka.domain.generic.Identity;

public class BodegaId extends Identity {
    public BodegaId() {
    }

    public BodegaId(String id) {
        super(id);
    }

    public static BodegaId of(String id) {
        return new BodegaId(id);
    }
}
