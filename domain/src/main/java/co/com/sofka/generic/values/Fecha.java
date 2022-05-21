package co.com.sofka.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Fecha implements ValueObject<LocalDateTime> {
    private final LocalDateTime value;

    public Fecha(LocalDateTime value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public LocalDateTime value() {
        return value;
    }
}
