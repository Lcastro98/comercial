package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.ActualizarDatosAsesor;

public class ActualizarDatosAsesorUseCase extends UseCase<RequestCommand<ActualizarDatosAsesor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosAsesor> actualizarDatosAsesorRequestCommand) {
        var command = actualizarDatosAsesorRequestCommand.getCommand();
        var tienda = Tienda.from(
                command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value())
        );
        tienda.actualizarDatosAsesor(command.getEntityId(), command.getNombre());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
