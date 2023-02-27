package co.com.storecar.usecase;


import co.com.storecar.usecase.generic.USeCaseForCommand;
import co.com.storecar.usecase.command.AsignarSupervisor;
import co.com.storecar.model.generic.DomainEvent;
import reactor.core.publisher.*;

public class AsignarSupervisorReactivoUseCase extends USeCaseForCommand<AsignarSupervisor> {

    /*private RepositoryExample repository;

    private EventBus bus;

    public AsignarSupervisorReactivoUseCase(RepositoryExample repository, EventBus bus) {

        this.repository = repository;
        this.bus = bus;
    }*/

    @Override
    public Flux<DomainEvent> apply(Mono<AsignarSupervisor> asignarSupervisorMono) {
        return null;
        /*return asignarSupervisorMono.flatMapMany(command-> repository.findById(command.getSupervisorGenetalId())
                .collectList()
                .flatMapIterable(events->{
                    SupervisorGeneral supervisorGeneral = SupervisorGeneral
                            .from(SupervisorGeneralID.of(command.getSupervisorGenetalId()), events);
                    supervisorGeneral.asignarSupervisor(
                            TableroTareasID.of(command.getTableroTareasId()),
                            SupervisorID.of(command.getSupervisorId()),
                            new Nombre(command.getNombre(), command.getArea()));
                    return supervisorGeneral.getUncommittedChanges();
                }).map(event->{
                    bus.publish(event);
                    return event;
                }).flatMap(event->repository.saveEvent(event)));*/
    }
}
