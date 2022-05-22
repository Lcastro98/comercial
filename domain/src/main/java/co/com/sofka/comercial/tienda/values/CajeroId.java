package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.Identity;

public class CajeroId extends Identity {
    public CajeroId() {
    }

    public CajeroId(String id) {
        super(id);
    }

    public static CajeroId of(String id) {
        return new CajeroId(id);
    }
}
