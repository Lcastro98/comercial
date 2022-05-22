package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caja implements ValueObject<Double> {
    private final Double fondoBase;

    public Caja(Double fondoBase) {
        this.fondoBase = Objects.requireNonNull(fondoBase);
    }

    @Override
    public Double value() {
        return fondoBase;
    }
}
