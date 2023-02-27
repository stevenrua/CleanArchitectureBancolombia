package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.UseCaseForEventNoReactive;
import co.com.storecar.model.events.TareaCreada;
import co.com.storecar.model.generic.*;

import java.util.List;

public class CrearTareaNoReactivo2UseCase implements UseCaseForEventNoReactive<TareaCreada> {

    //private RepositoryExample repository;

    /*public CrearTareaNoReactivo2UseCase(RepositoryExample repository) {

        //this.repository = repository;
    }*/

    @Override
    public List<DomainEvent> apply(TareaCreada event) {
        return null;
        //List<DomainEvent> events = repository.findByIdNoReactivo(event.aggregateRootId());
        /*SupervisorGeneral supervisorGeneral = SupervisorGeneral
                .from(SupervisorGeneralID.of(event.aggregateRootId()), List.of(event));
        supervisorGeneral.crearTarea(event.getTableroTareasID(),
                event.getTareaID(),
                new FechaCreacion(event.aggregateRootId()),
                new Nombre(event.getNombre().value().nombre(), event.getNombre().value().area()),
                new Descripcion(event.getDescripcion().value().descripcionTarea()));
        return supervisorGeneral.getUncommittedChanges().stream().map(event1->{
            return repository.saveEventNoReactivo(event1);
        }).collect(Collectors.toList());*/
    }
}
