package co.com.sofka.comercial.tienda;

import co.com.sofka.comercial.tienda.values.EncargadoId;
import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.generic.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Encargado extends Entity<EncargadoId> {
    protected Nombre nombre;
    protected MetaMensual metaMensual;

    public Encargado(EncargadoId entityId, Nombre nombre, MetaMensual metaMensual) {
        super(entityId);
        this.nombre = nombre;
        this.metaMensual = metaMensual;
    }
}
