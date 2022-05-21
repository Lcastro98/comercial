package co.com.sofka.comercial.venta.events;

import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class RegistrarVenta extends Command {
    private final VentaId ventaId;
    private final TiendaId tiendaId;

    public RegistrarVenta(VentaId ventaId, TiendaId tiendaId) {
        this.ventaId = ventaId;
        this.tiendaId = tiendaId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }
}
