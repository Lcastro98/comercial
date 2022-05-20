package co.com.sofka.comercial.bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;
import java.util.Objects;

public class Horario implements ValueObject<Horario.Props> {
    private final Time horaInicio;
    private final Time horaFin;

    public Horario(Time horaInicio, Time horaFin){
        this.horaInicio = Objects.requireNonNull(horaInicio);
        this.horaFin = Objects.requireNonNull(horaFin);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Time horaInicio() {
                return horaInicio;
            }

            @Override
            public Time horaFin() {
                return horaFin;
            }
        };
    }

    public interface Props {
        Time horaInicio();
        Time horaFin();
    }
}
