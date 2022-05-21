package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comision implements ValueObject<Float> {
    private final Float value;

    public Comision(Float value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Float value() {
        return value;
    }
}