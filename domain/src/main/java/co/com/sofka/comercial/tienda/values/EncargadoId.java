package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.Identity;

public class EncargadoId extends Identity {
    public EncargadoId() {
    }

    public EncargadoId(String id) {
        super(id);
    }

    public static EncargadoId of(String id) {
        return new EncargadoId(id);
    }
}
