package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.Bodeguero;
import co.com.sofka.comercial.bodega.Despacho;
import co.com.sofka.comercial.bodega.Vigilante;
import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Dimension;
import co.com.sofka.domain.generic.Command;

public class CrearBodega extends Command {
    private final BodegaId bodegaId;
    private final Dimension dimension;

    public CrearBodega(BodegaId bodegaId, Dimension dimension) {
        this.bodegaId = bodegaId;
        this.dimension = dimension;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
