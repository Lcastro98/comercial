package co.com.sofka.comercial.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<Ubicacion.Props> {
    private final String direccion;
    private final String ciudad;
    private final String pais;

    public Ubicacion(String direccion, String ciudad, String pais) {
        this.direccion = Objects.requireNonNull(direccion);
        this.ciudad = Objects.requireNonNull(ciudad);
        this.pais = Objects.requireNonNull(pais);
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String direccion() {
                return direccion;
            }

            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String pais() {
                return pais;
            }
        };
    }

    public interface Props {
        String direccion();

        String ciudad();

        String pais();
    }
}
