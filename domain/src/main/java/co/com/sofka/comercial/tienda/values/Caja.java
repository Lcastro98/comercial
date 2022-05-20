package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

public class Caja implements ValueObject<String> {
    private final String fondoBase;

    public Caja(String fondoBase) {
        this.fondoBase = fondoBase;
    }

    @Override
    public String value() {
        return fondoBase;
    }
}
