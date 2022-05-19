package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.Identity;

public class TiendaId extends Identity {
    public TiendaId(String id) {
        super(id);
    }

    public static TiendaId of(String id) {
        return new TiendaId(id);
    }
}
