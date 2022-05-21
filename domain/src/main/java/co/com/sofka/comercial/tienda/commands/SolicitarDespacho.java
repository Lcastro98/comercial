package co.com.sofka.comercial.tienda.commands;

import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.domain.generic.Command;

public class SolicitarDespacho extends Command {
    private final TiendaId tiendaId;
    private final BodegaId bodegaId;

    public SolicitarDespacho(TiendaId tiendaId, BodegaId bodegaId) {
        this.tiendaId = tiendaId;
        this.bodegaId = bodegaId;
    }

    public TiendaId getTiendaId() {
        return tiendaId;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }
}
