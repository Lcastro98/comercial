package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.bodega.commands.AsignarBodeguero;

public class AsignarBodegueroUseCase extends UseCase<RequestCommand<AsignarBodeguero>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarBodeguero> asignarBodegueroRequestCommand) {
        var command = asignarBodegueroRequestCommand.getCommand();
        var bodega = Bodega.from(
                command.getBodegaId(), repository().getEventsBy(command.getBodegaId().value())
        );
        bodega.asignarBodeguero(command.getNombre(), command.getSalario());

        emit().onResponse(new ResponseEvents(bodega.getUncommittedChanges()));
    }
}
