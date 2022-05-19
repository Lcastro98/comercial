package co.com.sofka.comercial.tienda;

import co.com.sofka.comercial.tienda.values.TiendaId;
import co.com.sofka.comercial.tienda.values.Ubicacion;
import co.com.sofka.domain.generic.AggregateEvent;

public class Tienda extends AggregateEvent<TiendaId> {
    protected Cajero cajero;
    protected Encargado encargado;
    protected Asesor asesor;
    protected Ubicacion ubicacion;

    public Tienda(TiendaId entityId) {
        super(entityId);
    }
}
