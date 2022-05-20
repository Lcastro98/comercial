package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Descuento implements ValueObject<Float> {

    private final Float value;

    public Descuento(Float value){
        this.value = value;
    }

    @Override
    public Float value() {
        return value;
    }
}
