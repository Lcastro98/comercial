package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.ActualizarDatosCajero;

public class ActualizarDatosCajeroUseCase extends UseCase<RequestCommand<ActualizarDatosCajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosCajero> actualizarDatosCajeroRequestCommand) {
        var command = actualizarDatosCajeroRequestCommand.getCommand();

        var tienda = Tienda.from(
                command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value())
        );
        tienda.actualizarDatosCajero(command.getEntityId(), command.getNombre());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
