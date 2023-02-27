package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.USeCaseForCommand;
import co.com.storecar.usecase.gateways.DomainEventRepository;
import co.com.storecar.model.SupervisorGeneral;
import co.com.storecar.usecase.command.CrearSupervisorGeneral;
import co.com.storecar.model.generic.*;
import co.com.storecar.model.values.*;
import reactor.core.publisher.*;

public class CrearSupervisorGeneralReactivoUseCase extends USeCaseForCommand<CrearSupervisorGeneral> {

    private final DomainEventRepository repository;

    public CrearSupervisorGeneralReactivoUseCase(DomainEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flux<DomainEvent> apply(Mono<CrearSupervisorGeneral> crearSupervisorGeneralMono) {
        return crearSupervisorGeneralMono.flatMapIterable(command ->{
            SupervisorGeneral supervisorGeneral = new SupervisorGeneral(
                    SupervisorGeneralID.of(command.getSupervisorGenetalId()),
                    new Nombre(command.getNombre(), command.getArea()),
                    TableroTareasID.of(command.getTableroTareasID()),
                    new Nombre(command.getNombreTablero(), command.getAreaTablero()),
                    new FechaCreacion(command.getFechaCreacion()));
                    return supervisorGeneral.getUncommittedChanges();
                });/*.flatMap(domainEvent -> repository.saveEvent(domainEvent));/*.map(event->{
                    bus.publish(event);
                    return event;
                });*/
    }
}
