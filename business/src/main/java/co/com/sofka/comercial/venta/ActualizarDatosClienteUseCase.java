package co.com.sofka.comercial.venta;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.venta.commands.ActualizarDatosCliente;

public class ActualizarDatosClienteUseCase extends UseCase<RequestCommand<ActualizarDatosCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosCliente> actualizarDatosClienteRequestCommand) {
        var command = actualizarDatosClienteRequestCommand.getCommand();
        var venta = Venta.from(
                command.getVentaId(), repository().getEventsBy(command.getVentaId().value())
        );
        venta.actualizarDatosCliente(command.getEntityId(), command.getNombre());

        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
