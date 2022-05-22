package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.ActualizarDatosEncargado;

public class ActualizarDatosEncargadoUseCase extends UseCase<RequestCommand<ActualizarDatosEncargado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDatosEncargado> actualizarDatosEncargadoRequestCommand) {
        var command = actualizarDatosEncargadoRequestCommand.getCommand();
        var tienda = Tienda.from(
                command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value())
        );
        tienda.actualizarDatosEncargado(command.getEntityId(), command.getNombre());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));

    }
}
