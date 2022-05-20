package co.com.sofka.comercial.bodega.values;

import co.com.sofka.domain.generic.Identity;

public class VigilanteId extends Identity {
    public VigilanteId() {
    }

    public VigilanteId(String id) {
        super(id);
    }

    public static VigilanteId of(String id) {
        return new VigilanteId(id);
    }
}
