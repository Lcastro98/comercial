package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<String> {

    private final String moneda;
    private final Double cantidad;

    public Precio(String moneda, Double cantidad) {
        this.moneda = Objects.requireNonNull(moneda);
        this.cantidad = Objects.requireNonNull(cantidad);
    }

    @Override
    public String value() {
        return cantidad + " " + moneda;
    }
}
