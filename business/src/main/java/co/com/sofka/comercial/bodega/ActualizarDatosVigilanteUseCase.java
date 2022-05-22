package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.bodega.commands.ActualizarDatosVigilante;

public class ActualizarDatosVigilanteUseCase extends UseCase<RequestCommand<ActualizarDatosVigilante>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosVigilante> actualizarDatosVigilanteRequestCommand) {
        var command = actualizarDatosVigilanteRequestCommand.getCommand();
        var bodega = Bodega.from(
                command.getBodegaId(), repository().getEventsBy(command.getBodegaId().value())
        );
        bodega.actualizarDatosVigilante(command.getEntityId(), command.getNombre());

        emit().onResponse(new ResponseEvents(bodega.getUncommittedChanges()));
    }
}
