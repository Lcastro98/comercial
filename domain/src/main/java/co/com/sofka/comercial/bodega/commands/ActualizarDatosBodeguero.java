package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.BodegueroId;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class ActualizarDatosBodeguero extends Command {
    private final BodegueroId entityId;
    private final Nombre nombre;
    private final Salario salario;

    public ActualizarDatosBodeguero(BodegueroId entityId, Nombre nombre){
        this.entityId = entityId;
        this.nombre = nombre;
        salario = null;
    }

    public ActualizarDatosBodeguero(BodegueroId entityId, Salario salario){
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
