package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.AsignarCajero;

public class AsignarCajeroUseCase extends UseCase<RequestCommand<AsignarCajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarCajero> asignarCajeroRequestCommand) {
        var command = asignarCajeroRequestCommand.getCommand();
        var tienda = Tienda.from(
                command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value())
        );
        tienda.asignarCajero(command.getNombre(), command.getCaja());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
