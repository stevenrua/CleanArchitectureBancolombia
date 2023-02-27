package co.com.storecar.usecase;

import co.com.storecar.model.events.SupervisorGeneralCreado;
import co.com.storecar.model.generic.*;
import reactor.core.publisher.*;

import java.util.function.Function;

public class CrearTablerotareasReactivoEventUseCase implements Function<Mono<SupervisorGeneralCreado>, Flux<DomainEvent>> {

    //private RepositoryExample repositoryExample;

    /*private EventBus bus;

    public CrearTablerotareasReactivoEventUseCase(RepositoryExample repositoryExample, EventBus bus) {
        //this.repositoryExample = repositoryExample;
        this.bus = bus;
    }*/

    @Override
    public Flux<DomainEvent> apply(Mono<SupervisorGeneralCreado> supervisorGeneralCreadoMono) {
        return null;
        /*return supervisorGeneralCreadoMono.flatMapIterable(event->{
            SupervisorGeneral supervisorGeneral = SupervisorGeneral
                    .from(SupervisorGeneralID.of(event.aggregateRootId()), List.of(event));
            supervisorGeneral.crearTableroTareas(
                    event.getTableroTareasID(),
                    event.getNombreTablero(),
                    event.getFechaCreacion());
                    return supervisorGeneral.getUncommittedChanges();
                    }).map(event->{
                        bus.publish(event);
                        return event;
                    }).flatMap(domainEvent -> repositoryExample.saveEvent(domainEvent));*/
    }
}
