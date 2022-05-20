package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.Identity;

public class AsesorId extends Identity {
    public AsesorId() {
    }
    public AsesorId(String id){
        super(id);
    }
    public static AsesorId of(String id) {
        return new AsesorId(id);
    }
}
