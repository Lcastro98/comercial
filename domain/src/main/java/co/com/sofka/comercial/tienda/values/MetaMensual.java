package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MetaMensual implements ValueObject<String> {
    private final String value;

    public MetaMensual(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.length() > 200){
            throw new IllegalArgumentException("La meta mensual no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

}
