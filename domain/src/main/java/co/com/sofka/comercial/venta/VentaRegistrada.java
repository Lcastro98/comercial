package co.com.sofka.comercial.venta;

import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.venta.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class VentaRegistrada extends DomainEvent {
    private final Total total;
    private final TiendaId tiendaId;

    public VentaRegistrada(Total total, TiendaId tiendaId) {
        super("co.com.sofka.comercial.VentaRealizada");
        this.total = total;
        this.tiendaId = tiendaId;
    }

    public Total getTotal() {
        return total;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }
}
