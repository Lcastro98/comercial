package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.values.BodegueroId;
import co.com.sofka.comercial.bodega.values.Salario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.values.Nombre;

public class AsignarBodeguero extends Command {
    private final BodegueroId bodegueroId;
    private final Nombre nombre;
    private final Salario salario;

    public AsignarBodeguero(BodegueroId bodegueroId, Nombre nombre, Salario salario){
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
