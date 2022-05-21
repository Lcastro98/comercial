package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.events.BodegaCreada;
import co.com.sofka.comercial.bodega.events.BodegueroAsignado;
import co.com.sofka.comercial.bodega.events.DespachoAsignado;
import co.com.sofka.comercial.bodega.events.VigilanteAsignado;
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
    }
}
