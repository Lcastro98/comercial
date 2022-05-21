package co.com.sofka.comercial.tienda;

import co.com.sofka.comercial.tienda.events.*;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.generic.values.Nombre;

public class TiendaEventChange extends EventChange {
    public TiendaEventChange(Tienda tienda) {
        apply((TiendaCreada event) -> {
            tienda.ubicacion = event.getUbicacion();
        });

        apply((CajeroAsignado event) -> {
            tienda.cajero.nombre = (Nombre) event.getNombre().value();
            tienda.cajero.caja = event.getCaja();
        });

        apply((EncargadoAsignado event) -> {
            tienda.encargado.nombre = (Nombre) event.getNombre().value();
            tienda.encargado.metaMensual = event.getMetaMensual();
        });

        apply((AsesorAsignado event) -> {
            tienda.asesor.nombre = (Nombre) event.getNombre().value();
            tienda.asesor.comision = event.getComision();
        });

        apply((AsesorActualizado event) -> {
            tienda.asesor.actualizarNombre((Nombre) event.getNombre().value());
            tienda.asesor.actualizarComision(event.getComision());
        });

        apply((CajeroActualizado event) -> {
            tienda.cajero.actualizarNombre((Nombre) event.getNombre().value());
            tienda.cajero.actualizarCaja(event.getCaja());
        });

        apply((EncargadoActualizado event) -> {
            tienda.encargado.actualizarNombre((Nombre) event.getNombre().value());
            tienda.encargado.actualizarMetaMensual(event.getMetaMensual());
        });

        apply((TotalVentasActualizado event) -> {
            tienda.totalVentas = event.getTotalVentas();
        });
    }
}
