package co.com.sofka.comercial.bodega;

import co.com.sofka.comercial.bodega.values.BodegaId;
import co.com.sofka.comercial.bodega.values.Dimension;
import co.com.sofka.domain.generic.Entity;

public class Bodega extends Entity<BodegaId> {
    protected Bodeguero bodeguero;
    protected Vigilante vigilante;
    protected Despacho despacho;
    protected Dimension dimension;

    public Bodega(BodegaId entityId) {
        super(entityId);
    }
}
