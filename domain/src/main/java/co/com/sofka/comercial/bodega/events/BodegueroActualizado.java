package co.com.sofka.comercial.bodega.events;

import co.com.sofka.comercial.bodega.values.BodegueroId;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class BodegueroActualizado extends DomainEvent {
    private final BodegueroId entityId;
    private final Nombre nombre;
    private final Salario salario;

    public BodegueroActualizado(BodegueroId entityId, Nombre nombre) {
        super("co.com.sofka.comercial.BodegueroActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        salario = null;
    }

    public BodegueroActualizado(BodegueroId entityId, Salario salario) {
        super("co.com.sofka.comercial.BodegueroActualizado");
        this.entityId = entityId;
        this.salario = salario;
        nombre = null;
    }

    public BodegueroId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Salario getSalario() {
        return salario;
    }
}
