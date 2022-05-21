package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.events.*;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.generic.values.Nombre;

public class BodegaEventChange extends EventChange {
    public BodegaEventChange(Bodega bodega) {
        apply((BodegaCreada event) -> {
            bodega.dimension = event.getDimension();
        });

        apply((BodegueroAsignado event) -> {
            bodega.bodeguero.nombre = (Nombre) event.getNombre().value();
            bodega.bodeguero.salario = event.getSalario();
        });

        apply((VigilanteAsignado event) -> {
            bodega.vigilante.nombre = event.getNombre();
            bodega.vigilante.horario = event.getHorario();
        });

        apply((DespachoAsignado event) -> {
            bodega.despacho.fecha = event.getFecha();
            bodega.despacho.destino = event.getDestino();
        });

        apply((BodegueroActualizado event) -> {
            bodega.bodeguero.actualizarNombre((Nombre) event.getNombre().value());
            bodega.bodeguero.actualizarSalario(event.getSalario());
        });

        apply((VigilanteActualizado event) -> {
            bodega.vigilante.actualizarNombre((Nombre) event.getNombre().value());
            bodega.vigilante.actualizarHorario(event.getHorario());
        });

        apply((DespachoActualizado event) -> {
            bodega.despacho.actualizarFecha(event.getFecha());
            bodega.despacho.actualizarDestino(event.getDestino());
        });

        apply((DespachoRealizado event) -> {
            bodega.ubicacion = event.getUbicacion();
        });
    }
}
