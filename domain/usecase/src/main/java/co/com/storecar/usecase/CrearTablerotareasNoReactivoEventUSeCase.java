package co.com.storecar.usecase;


import co.com.storecar.usecase.generic.UseCaseForEventNoReactive;
import co.com.storecar.model.events.SupervisorGeneralCreado;
import co.com.storecar.model.generic.DomainEvent;

import java.util.List;

public class CrearTablerotareasNoReactivoEventUSeCase implements UseCaseForEventNoReactive<SupervisorGeneralCreado> {

    //private RepositoryExample repository;

    /*public CrearTablerotareasNoReactivoEventUSeCase(RepositoryExample repository) {

        //this.repository = repository;
    }*/


    @Override
    public List<DomainEvent> apply(SupervisorGeneralCreado domainEvent) {
        return null;
        /*SupervisorGeneral supervisorGeneral = SupervisorGeneral
                .from(SupervisorGeneralID.of(domainEvent.aggregateRootId()), List.of(domainEvent));
        supervisorGeneral.crearTableroTareas(domainEvent.getTableroTareasID(),
                domainEvent.getNombre(),
                domainEvent.getFechaCreacion());
        return supervisorGeneral.getUncommittedChanges().stream().map(event->{
            return repository.saveEventNoReactivo(event);
        }).collect(Collectors.toList());*/
    }
}
