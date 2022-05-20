package co.com.sofka.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Props> {
    private final String nombre;
    private final String apellido;

    public Nombre(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }
        if (this.apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede estar en blanco");
        }
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Props {
        String nombre();

        String apellido();
    }
}