package co.com.sofka.comercial.bodega;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.comercial.bodega.commands.CrearBodega;


public class CrearBodegaUseCase extends UseCase<RequestCommand<CrearBodega>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearBodega> crearBodegaRequestCommand) {
        var command = crearBodegaRequestCommand.getCommand();

        var bodega = new Bodega(
                command.getBodegaId(),
                command.getDimension()
        );

        emit().onResponse(new ResponseEvents(bodega.getUncommittedChanges()));
    }
}
