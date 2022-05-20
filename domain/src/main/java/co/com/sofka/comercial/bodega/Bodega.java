package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.events.*;
import co.com.sofka.comercial.bodega.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;
import co.com.sofka.generic.values.Nombre;

import java.util.List;
import java.util.Objects;

public class Bodega extends AggregateEvent<BodegaId> {
    protected Bodeguero bodeguero;
    protected Vigilante vigilante;
    protected Despacho despacho;
    protected Dimension dimension;

    public Bodega(BodegaId entityId, Dimension dimension) {
        super(entityId);
        appendChange(new BodegaCreada(dimension)).apply();
        subscribe(new BodegaEventChange(this));
    }

    private Bodega(BodegaId entityId){
        super(entityId);
        subscribe(new BodegaEventChange(this));
    }

    public static Bodega from(BodegaId entityId, List<DomainEvent> events) {
        var bodega = new Bodega(entityId);
        events.forEach(bodega::applyEvent);
        return bodega;
    }

    public void asignarBodeguero(Nombre nombre, Salario salario){
        var bodegueroId = new BodegueroId();
        appendChange(new BodegueroAsignado(bodegueroId, nombre, salario)).apply();
    }

    public void asignarVigilante(Nombre nombre, Horario horario){
        var vigilanteId = new VigilanteId();
        appendChange(new VigilanteAsignado(vigilanteId, nombre, horario)).apply();
    }

    public void asignarDespacho(Fecha fecha, Destino destino){
        var despachoId = new DespachoId();
        appendChange(new DespachoAsignado(despachoId, fecha, destino)).apply();
    }

    public void actualizarDatosBodeguero(BodegueroId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new BodegueroActualizado(entityId, nombre)).apply();
    }

    public void actualizarDatosBodeguero(BodegueroId entityId, Salario salario){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(salario);
        appendChange(new BodegueroActualizado(entityId, salario)).apply();
    }

    public void actualizarDatosVigilante(VigilanteId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new VigilanteActualizado(entityId, nombre)).apply();
    }

    public void actualizarDatosVigilante(VigilanteId entityId, Horario horario){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(horario);
        appendChange(new VigilanteActualizado(entityId, horario)).apply();
    }

    public void actualizarDatosDespacho(DespachoId entityId, Fecha fecha){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fecha);
        appendChange(new DespachoActualizado(entityId, fecha)).apply();
    }

    public void actualizarDatosDespacho(DespachoId entityId, Destino destino){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(destino);
        appendChange(new DespachoActualizado(entityId, destino)).apply();
    }

    public Bodeguero bodeguero() {
        return bodeguero;
    }

    public Vigilante bigilante() {
        return vigilante;
    }

    public Despacho despacho() {
        return despacho;
    }

    public Dimension dimension() {
        return dimension;
    }
}
