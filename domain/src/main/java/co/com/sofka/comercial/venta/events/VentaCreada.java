package co.com.sofka.comercial.venta.events;

import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Fecha;

public class VentaCreada extends DomainEvent {
    protected final TiendaId tiendaId;
    private final Fecha fecha;
    private final Total total;

    public VentaCreada(TiendaId tiendaId, Fecha fecha, Total total) {
        super("co.com.sofka.comercial.VentaCreada");
        this.tiendaId = tiendaId;
        this.fecha = fecha;
        this.total = total;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Total getTotal() {
        return total;
    }
}
