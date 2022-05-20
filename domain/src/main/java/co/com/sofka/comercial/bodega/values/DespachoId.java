package co.com.sofka.comercial.bodega.values;

import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Identity;

public class DespachoId extends Identity {

    public DespachoId() {
    }

    public DespachoId(String id) {
        super(id);
    }

    public static DespachoId of(String id) {
        return new DespachoId(id);
    }
}
