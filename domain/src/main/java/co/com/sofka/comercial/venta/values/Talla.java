package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Talla implements ValueObject<Talla.Tallas> {

    private final Tallas value;

    public Talla(Tallas value) {

        this.value = value;
    }
    @Override
    public Tallas value() {
        return value;
    }

    public enum Tallas {
        XS, S, M, L
    }
}
