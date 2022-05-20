package co.com.sofka.comercial.bodega.values;

import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destino implements ValueObject<String> {

    private final Ubicacion value;

    public Destino(Ubicacion value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value.value().direccion();
    }
}
