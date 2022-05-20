package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.BodegueroId;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class BodegueroAsignado extends DomainEvent {
    private final BodegueroId bodegueroId;
    private final Nombre nombre;
    private final Salario salario;

    public BodegueroAsignado(BodegueroId bodegueroId, Nombre nombre, Salario salario) {
        super("co.com.sofka.comercial.BodegueroAsignado");
        this.bodegueroId = bodegueroId;
        this.nombre = nombre;
        this.salario = salario;
    }

    public BodegueroId getBodegueroId() {
        return bodegueroId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Salario getSalario() {
        return salario;
    }
}
