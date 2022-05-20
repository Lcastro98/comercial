package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Total implements ValueObject<Double> {
    private final Double value;

    public Total(Double value){
        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }
}
