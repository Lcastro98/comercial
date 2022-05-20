package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.values.EncargadoId;
import co.com.sofka.comercial.tienda.values.MetaMensual;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class EncargadoAsignado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Nombre nombre;
    private final MetaMensual metaMensual;

    public EncargadoAsignado(EncargadoId encargadoId, Nombre nombre, MetaMensual metaMensual) {
        super("co.com.sofka.comercial.EncargadoAsignado");
        this.encargadoId = encargadoId;
        this.nombre = nombre;
        this.metaMensual = metaMensual;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public MetaMensual getMetaMensual() {
        return metaMensual;
    }
}
