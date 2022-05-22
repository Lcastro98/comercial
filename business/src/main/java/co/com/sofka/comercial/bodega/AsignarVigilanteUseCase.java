package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.bodega.commands.AsignarVigilante;

public class AsignarVigilanteUseCase extends UseCase<RequestCommand<AsignarVigilante>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarVigilante> asignarVigilanteRequestCommand) {
        var command = asignarVigilanteRequestCommand.getCommand();
        var bodega = Bodega.from(
                command.getBodegaId(), repository().getEventsBy(command.getBodegaId().value())
        );
        bodega.asignarVigilante(command.getNombre(), command.getHorario());

        emit().onResponse(new ResponseEvents(bodega.getUncommittedChanges()));
    }
}
