package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.AsignarEncargado;

public class AsignarEncargadoUseCase extends UseCase<RequestCommand<AsignarEncargado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarEncargado> asignarEncargadoRequestCommand) {
        var command = asignarEncargadoRequestCommand.getCommand();
        var tienda = Tienda.from(
                command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value())
        );
        tienda.asignarEncargado(command.getNombre(), command.getMetaMensual());

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
