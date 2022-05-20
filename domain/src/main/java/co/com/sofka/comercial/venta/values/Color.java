package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Color implements ValueObject<String> {

    private final String value;

    public Color(String value){
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
