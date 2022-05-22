package co.com.sofka.comercial.bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Dimension implements ValueObject<Dimension.Props> {
    private final Float largo;
    private final Float alto;
    private final Float ancho;

    public Dimension(Float largo, Float alto, Float ancho) {
        this.largo = Objects.requireNonNull(largo);
        this.alto = Objects.requireNonNull(alto);
        this.ancho = Objects.requireNonNull(ancho);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Float largo() {
                return largo;
            }

            @Override
            public Float alto() {
                return alto;
            }

            @Override
            public Float ancho() {
                return ancho;
            }
        };
    }

    public interface Props {
        Float largo();

        Float alto();

        Float ancho();
    }
}

