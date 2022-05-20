package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comision implements ValueObject<String> {
    private final String value;

    public Comision(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}