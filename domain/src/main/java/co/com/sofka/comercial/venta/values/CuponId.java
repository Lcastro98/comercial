package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.Identity;

public class CuponId extends Identity {
    public CuponId() {
    }

    public CuponId(String id){
        super(id);
    }

    public static CuponId of(String id) {
        return new CuponId(id);
    }
}
