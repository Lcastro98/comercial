package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.bodega.commands.ActualizarDatosBodeguero;

public class ActualizarDatosBodegueroUseCase extends UseCase<RequestCommand<ActualizarDatosBodeguero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosBodeguero> actualizarDatosBodegueroRequestCommand) {
        var command = actualizarDatosBodegueroRequestCommand.getCommand();
        var bodega = Bodega.from(
                command.getBodegaId(), repository().getEventsBy(command.getBodegaId().value())
        );
        bodega.actualizarDatosBodeguero(command.getEntityId(), command.getSalario());

        emit().onResponse(new ResponseEvents(bodega.getUncommittedChanges()));

    }
}
