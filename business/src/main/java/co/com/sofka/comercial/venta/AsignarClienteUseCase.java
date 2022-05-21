package co.com.sofka.comercial.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.venta.commands.AsignarCliente;

public class AsignarClienteUseCase extends UseCase<RequestCommand<AsignarCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarCliente> asignarClienteRequestCommand) {
        var command = asignarClienteRequestCommand.getCommand();
        var venta = Venta.from(
                command.getVentaId(), repository().getEventsBy(command.getVentaId().value())
        );
        venta.asignarCliente(command.getNombre(), command.getTelefono());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
