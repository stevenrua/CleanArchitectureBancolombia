package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.UseCaseForCommandNoReactive;
import co.com.storecar.usecase.command.CrearTarea;
import co.com.storecar.model.generic.*;

import java.util.List;

public class CrearTareaNoReactivoUseCase implements UseCaseForCommandNoReactive<CrearTarea> {

    //private RepositoryExample repository;

    /*public CrearTareaNoReactivoUseCase(RepositoryExample repository) {

        //this.repository = repository;
    }*/

    @Override
    public List<DomainEvent> apply(CrearTarea command) {
        return null;
        /*List<DomainEvent> events = repository.findByIdNoReactivo(command.getSupervisorGenetalId());
        SupervisorGeneral supervisorGeneral = SupervisorGeneral
                .from(SupervisorGeneralID.of(command.getSupervisorGenetalId()), events);
        supervisorGeneral.crearTarea(TableroTareasID
                .of(command.getTableroTareasId()), TareaID.of(command.getTareaId()),
                new FechaCreacion(command.getSupervisorGenetalId()),
                new Nombre(command.getNombre(), command.getArea()),
                new Descripcion(command.getDescripcion()));
        return supervisorGeneral.getUncommittedChanges().stream().map(event->{
            return repository.saveEventNoReactivo(event);
        }).collect(Collectors.toList());*/
    }
}
