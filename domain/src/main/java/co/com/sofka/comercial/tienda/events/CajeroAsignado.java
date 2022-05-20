package co.com.sofka.comercial.tienda.events;

import co.com.sofka.comercial.tienda.values.Caja;
import co.com.sofka.comercial.tienda.values.CajeroId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.Nombre;

public class CajeroAsignado extends DomainEvent {
    private final CajeroId cajeroId;
    private final Nombre nombre;
    private final Caja caja;

    public CajeroAsignado(CajeroId cajeroId, Nombre nombre, Caja caja) {
        super("co.com.sofka.comercial.CajeroAsignado");
        this.cajeroId = cajeroId;
        this.nombre = nombre;
        this.caja = caja;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Caja getCaja() {
        return caja;
    }
}
