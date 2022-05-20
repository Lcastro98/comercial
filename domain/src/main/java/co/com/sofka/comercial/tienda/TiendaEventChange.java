package co.com.sofka.comercial.tienda;

import co.com.sofka.comercial.tienda.events.*;
import co.com.sofka.domain.generic.EventChange;

public class TiendaEventChange extends EventChange {
    public TiendaEventChange(Tienda tienda) {
        apply((TiendaCreada event) -> {
            tienda.ubicacion = event.getUbicacion();
        });

        apply((CajeroAsignado event) -> {
            tienda.cajero.nombre = event.getNombre();
            tienda.cajero.caja = event.getCaja();
        });

        apply((EncargadoAsignado event) -> {
            tienda.encargado.nombre = event.getNombre();
            tienda.encargado.metaMensual = event.getMetaMensual();
        });

        apply((AsesorAsignado event) -> {
            tienda.asesor.nombre = event.getNombre();
            tienda.asesor.comision = event.getComision();
        });

        apply((AsesorActualizado event) -> {
            tienda.asesor.actualizarNombre(event.getNombre());
        });

        apply((AsesorActualizado event) -> {
            tienda.asesor.actualizarComision(event.getComision());
        });

        apply((CajeroActualizado event) -> {
            tienda.cajero.actualizarNombre(event.getNombre());
        });

        apply((CajeroActualizado event) -> {
            tienda.cajero.actualizarCaja(event.getCaja());
        });

        apply((EncargadoActualizado event) -> {
            tienda.encargado.actualizarNombre(event.getNombre());
        });

        apply((EncargadoActualizado event) -> {
            tienda.encargado.actualizarMetaMensual(event.getMetaMensual());
        });
    }
}
