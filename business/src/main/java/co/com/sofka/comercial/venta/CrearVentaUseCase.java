package co.com.sofka.comercial.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.venta.commands.CrearVenta;

public class CrearVentaUseCase extends UseCase<RequestCommand<CrearVenta>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVenta> crearVentaRequestCommand) {
        var command = crearVentaRequestCommand.getCommand();

        var venta = new Venta(
                command.getTiendaId(),
                command.getVentaId(),
                command.getFecha(),
                command.getTotal()
        );

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
