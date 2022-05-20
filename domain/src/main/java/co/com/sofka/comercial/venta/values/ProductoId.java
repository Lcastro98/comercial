package co.com.sofka.comercial.venta.values;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {
    public ProductoId() {
    }

    public ProductoId(String id){
        super(id);
    }

    public static ProductoId of(String id) {
        return new ProductoId(id);
    }
}
