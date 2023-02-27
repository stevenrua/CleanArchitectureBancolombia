package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.UseCaseForCommandNoReactive;
import co.com.storecar.usecase.command.AsignarSupervisor;
import co.com.storecar.model.generic.*;

import java.util.List;

public class AsignarSupervisorNoReactivoUseCase implements UseCaseForCommandNoReactive<AsignarSupervisor> {
    //private RepositoryExample repository;

    /*public AsignarSupervisorNoReactivoUseCase(RepositoryExample repository) {

        //this.repository = repository;
    }*/

    @Override
    public List<DomainEvent> apply(AsignarSupervisor command) {
        return null;
        /*List<DomainEvent> events = repository.findByIdNoReactivo(command.getSupervisorGenetalId());
        System.out.println("este el el id del agregado: " + command.getSupervisorGenetalId());
        SupervisorGeneral supervisorGeneral = SupervisorGeneral.from(SupervisorGeneralID.of(command.getSupervisorGenetalId()), events);
        supervisorGeneral.asignarSupervisor(TableroTareasID.of(command.getTableroTareasId()), SupervisorID.of(command.getSupervisorId()), new Nombre(command.getNombre(), command.getArea()));
        //supervisorGeneral.asignarSupervisor(TableroTareasID.of(command.getTableroTareasId()), SupervisorID.of(command.getSupervisorId()), new Nombre(command.getNombre(), command.getArea()));
        //me retorna la lista de eventos que se va creando
        return supervisorGeneral.getUncommittedChanges().stream().map(event->{
            return repository.saveEventNoReactivo(event);
        }).collect(Collectors.toList());*/
    }
}
