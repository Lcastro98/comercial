package co.com.sofka.comercial.bodega.values;

import co.com.sofka.domain.generic.Identity;

public class BodegueroId extends Identity {
    public BodegueroId() {
    }
    public BodegueroId(String id) {
        super(id);
    }

    public static BodegueroId of(String id) {
        return new BodegueroId(id);
    }
}
