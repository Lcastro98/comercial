package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarBodeguero extends Command {
    private final BodegaId bodegaId;
    private final Nombre nombre;
    private final Salario salario;

    public AsignarBodeguero(BodegaId bodegaId, Nombre nombre, Salario salario){
        this.bodegaId = bodegaId;
        this.nombre = nombre;
        this.salario = salario;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Salario getSalario() {
        return salario;
    }
}
