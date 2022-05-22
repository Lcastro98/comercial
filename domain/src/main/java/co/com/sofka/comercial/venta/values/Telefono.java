package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    private final String value;

    public Telefono(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
