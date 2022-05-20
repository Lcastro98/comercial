package co.com.sofka.comercial.tienda;


import co.com.sofka.comercial.tienda.events.*;
import co.com.sofka.comercial.tienda.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

import java.util.List;
import java.util.Objects;

public class Tienda extends AggregateEvent<TiendaId> {
    protected Cajero cajero;
    protected Encargado encargado;
    protected Asesor asesor;
    protected Ubicacion ubicacion;

    public Tienda(TiendaId entityId, Ubicacion ubicacion) {
        super(entityId);
        appendChange(new TiendaCreada(ubicacion)).apply();
        subscribe(new TiendaEventChange(this));
    }

    private Tienda(TiendaId entityId){
        super(entityId);
        subscribe(new TiendaEventChange(this));
    }

    public static Tienda from(TiendaId entityId, List<DomainEvent> events){
        var tienda = new Tienda(entityId);
        events.forEach(tienda::applyEvent);
        return tienda;
    }

    public void asignarCajero(Nombre nombre, Caja caja){
        var cajeroId = new CajeroId();
        appendChange(new CajeroAsignado(cajeroId, nombre, caja)).apply();
    }

    public void asignarEncargado(Nombre nombre, MetaMensual metaMensual){
        var encargadoId = new EncargadoId();
        appendChange(new EncargadoAsignado(encargadoId, nombre, metaMensual)).apply();
    }

    public void asignarAsesor(Nombre nombre, Comision comision){
        var asesorId = new AsesorId();
        appendChange(new AsesorAsignado(asesorId, nombre, comision)).apply();

    }

    public void actualizarDatosCajero(CajeroId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new CajeroActualizado(entityId, nombre)).apply();
    }

    public void actualizarDatosCajero(CajeroId entityId, Caja caja){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(caja);
        appendChange(new CajeroActualizado(entityId, caja)).apply();
    }

    public void actualizarDatosEncargado(EncargadoId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new EncargadoActualizado(entityId, nombre)).apply();
    }

    public void actualizarDatosEncargado(EncargadoId entityId, MetaMensual metaMensual){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(metaMensual);
        appendChange(new EncargadoActualizado(entityId, metaMensual)).apply();
    }

    public void actualizarDatosAsesor(AsesorId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AsesorActualizado(entityId, nombre)).apply();
    }

    public void actualizarDatosAsesor(AsesorId entityId, Comision comision){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(comision);
        appendChange(new AsesorActualizado(entityId, comision)).apply();
    }

    public Cajero cajero() {
        return cajero;
    }

    public Encargado encargado() {
        return encargado;
    }

    public Asesor asesor() {
        return asesor;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }
}
