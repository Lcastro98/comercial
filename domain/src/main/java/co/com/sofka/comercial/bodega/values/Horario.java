package co.com.sofka.comercial.bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Objects;

public class Horario implements ValueObject<Horario.Props> {
    private final LocalDateTime horaInicio;
    private final LocalDateTime horaFin;

    public Horario(LocalDateTime horaInicio, LocalDateTime horaFin) {
        this.horaInicio = Objects.requireNonNull(horaInicio);
        this.horaFin = Objects.requireNonNull(horaFin);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public LocalDateTime horaInicio() {
                return horaInicio;
            }

            @Override
            public LocalDateTime horaFin() {
                return horaFin;
            }
        };
    }

    public interface Props {
        LocalDateTime horaInicio();

        LocalDateTime horaFin();
    }
}
