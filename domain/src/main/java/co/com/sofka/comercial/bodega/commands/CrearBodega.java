package co.com.sofka.comercial.bodega.commands;

import co.com.sofka.comercial.bodega.Bodeguero;
import co.com.sofka.comercial.bodega.Despacho;
import co.com.sofka.comercial.bodega.Vigilante;
import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Dimension;
import co.com.sofka.domain.generic.Command;

public class CrearBodega extends Command {
    private final BodegaId bodegaId;
    private final Bodeguero bodeguero;
    private final Vigilante vigilante;
    private final Despacho despacho;
    private final Dimension dimension;

    public CrearBodega(BodegaId bodegaId, Bodeguero bodeguero, Vigilante vigilante, Despacho despacho, Dimension dimension) {
        this.bodegaId = bodegaId;
        this.bodeguero = bodeguero;
        this.vigilante = vigilante;
        this.despacho = despacho;
        this.dimension = dimension;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Bodeguero getBodeguero() {
        return bodeguero;
    }

    public Vigilante getVigilante() {
        return vigilante;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
