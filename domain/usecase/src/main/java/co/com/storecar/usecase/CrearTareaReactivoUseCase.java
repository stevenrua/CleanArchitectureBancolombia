package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.USeCaseForCommand;
import co.com.storecar.usecase.command.CrearTarea;
import co.com.storecar.model.generic.*;
import reactor.core.publisher.*;

public class CrearTareaReactivoUseCase extends USeCaseForCommand<CrearTarea> {

    //private final RepositoryExample repository;

    /*private final EventBus bus;

    public CrearTareaReactivoUseCase(RepositoryExample repository, EventBus bus) {

        //this.repository = repository;
        this.bus = bus;
    }*/

    @Override
    public Flux<DomainEvent> apply(Mono<CrearTarea> crearTareaMono) {
        return null;
        /*return crearTareaMono.flatMapMany(command-> repository.findById(command.getSupervisorGenetalId())
                .collectList()
                .flatMapIterable(events -> {
                    SupervisorGeneral supervisorGeneral = SupervisorGeneral.from(
                            SupervisorGeneralID.of(command.getSupervisorGenetalId()), events);
                    supervisorGeneral.crearTarea(TableroTareasID.of(command.getTableroTareasId()),
                            TareaID.of(command.getTareaId()),
                            new FechaCreacion(command.getSupervisorGenetalId()),
                            new Nombre(command.getNombre(), command.getArea()),
                            new Descripcion(command.getDescripcion()));
                    return supervisorGeneral.getUncommittedChanges();
                }).map(event->{
                    bus.publish(event);
                    return event;
                }).flatMap(event-> repository.saveEvent(event)));*/
    }
}
