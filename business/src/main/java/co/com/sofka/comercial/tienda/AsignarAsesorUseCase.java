package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.AsignarAsesor;

public class AsignarAsesorUseCase extends UseCase<RequestCommand<AsignarAsesor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarAsesor> asignarAsesorRequestCommand) {
        var command = asignarAsesorRequestCommand.getCommand();
        var tienda = Tienda.from(
                command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value())
        );
        tienda.asignarAsesor(command.getNombre(), command.getComision());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
