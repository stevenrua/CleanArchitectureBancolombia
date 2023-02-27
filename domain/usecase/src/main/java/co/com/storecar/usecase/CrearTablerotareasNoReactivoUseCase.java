package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.UseCaseForCommandNoReactive;
import co.com.storecar.usecase.command.CrearTableroTareas;
import co.com.storecar.model.generic.*;

import java.util.List;

public class CrearTablerotareasNoReactivoUseCase implements UseCaseForCommandNoReactive<CrearTableroTareas> {

    //private RepositoryExample repository;

    /*public CrearTablerotareasNoReactivoUseCase(RepositoryExample repository) {

        //this.repository = repository;
    }*/
    @Override
    public List<DomainEvent> apply(CrearTableroTareas command) {
        return null;
        /*List<DomainEvent> events = repository.findByIdNoReactivo(command.getSupervisorGenetalId());
        SupervisorGeneral supervisorGeneral = SupervisorGeneral
                .from(SupervisorGeneralID.of(command.getSupervisorGenetalId()), events);
        supervisorGeneral.crearTableroTareas(TableroTareasID.of(command.getTableroTareasId()),
                new Nombre(command.getNombre(), command.getArea()),
                new FechaCreacion(command.getSupervisorGenetalId()));
        return supervisorGeneral.getUncommittedChanges().stream().map(event->{
            return repository.saveEventNoReactivo(event);
        }).collect(Collectors.toList());*/
    }
}
