package co.com.sofka.comercial.tienda;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.tienda.commands.CrearTienda;

public class CrearTiendaUseCase extends UseCase<RequestCommand<CrearTienda>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTienda> crearTiendaRequestCommand) {
        var command = crearTiendaRequestCommand.getCommand();

        var tienda = new Tienda(
                command.getTiendaId(),
                command.getUbicacion()
        );

        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
