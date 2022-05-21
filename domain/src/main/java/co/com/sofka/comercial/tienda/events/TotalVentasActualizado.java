package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class TotalVentasActualizado extends DomainEvent {

    private final Total totalVentas;

    public TotalVentasActualizado(Total totalVentas) {
        super("co.com.sofka.comercial.ListaDeVentasActualizado");
        this.totalVentas = totalVentas;
    }

    public Total getTotalVentas() {
        return totalVentas;
    }
}
