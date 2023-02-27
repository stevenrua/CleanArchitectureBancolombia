package co.com.storecar.usecase;

import co.com.storecar.usecase.generic.UseCaseForCommandNoReactive;
import co.com.storecar.usecase.generic.Command;
import co.com.storecar.model.generic.DomainEvent;

import java.util.List;

public class CreateSupervisorGeneralNoReactivoUseCase implements UseCaseForCommandNoReactive {
    /*private RepositoryExample repositoryExample;

    public CreateSupervisorGeneralNoReactivoUseCase(RepositoryExample repositoryExample) {
        //this.repositoryExample = repositoryExample;
    }*/

    @Override
    public List<DomainEvent> apply(Command command) {
        return null;
        /*CrearSupervisorGeneral crearSupervisorGeneral = (CrearSupervisorGeneral) command;
        SupervisorGeneral supervisorGeneral =
                new SupervisorGeneral(SupervisorGeneralID.of(crearSupervisorGeneral.getSupervisorGenetalId()),
                new Nombre(crearSupervisorGeneral.getNombre(), crearSupervisorGeneral.getArea()),
                new TableroTareasID(),
                        new Nombre("nombretablero", "areatablero"),
                        new FechaCreacion(crearSupervisorGeneral.getSupervisorGenetalId()));
        return supervisorGeneral.getUncommittedChanges().stream().map(event -> {
            return repositoryExample.saveEventNoReactivo(event);
        }).collect(Collectors.toList());*/
    }
}
