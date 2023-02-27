package co.com.storecar.model;


import co.com.storecar.model.events.SupervisorAsignado;
import co.com.storecar.model.events.SupervisorGeneralCreado;
import co.com.storecar.model.events.TableroCreado;
import co.com.storecar.model.events.TareaCreada;
import co.com.storecar.model.generic.AggregateRoot;
import co.com.storecar.model.generic.DomainEvent;
import co.com.storecar.model.values.*;


import java.util.List;

public class SupervisorGeneral extends AggregateRoot<SupervisorGeneralID> {
    protected List<TableroTareas> tableroTareas;
    protected Nombre nombre;

    public SupervisorGeneral(SupervisorGeneralID supervisorGeneralID, Nombre nombre, TableroTareasID tableroTareasID, Nombre nombreTablero, FechaCreacion fecha){
        super(supervisorGeneralID);
        System.out.println("entra clase supervisor general");
        subscribe(new SupervisorGeneralEventChange(this));
        appendChange(new SupervisorGeneralCreado(nombre, tableroTareasID, nombreTablero, fecha)).apply();
    }

    private SupervisorGeneral(SupervisorGeneralID id){
        super(id);
        subscribe(new SupervisorGeneralEventChange(this));
    }

    public static SupervisorGeneral from(SupervisorGeneralID id, List<DomainEvent> events){
        SupervisorGeneral supervisorGeneral = new SupervisorGeneral(id);
        events.forEach(event -> supervisorGeneral.applyEvent(event));
        return supervisorGeneral;
    }

    public void crearTableroTareas(TableroTareasID tableroTareasID, Nombre nombre, FechaCreacion fechaCreacion){
        appendChange(new TableroCreado(tableroTareasID, nombre, fechaCreacion)).apply();
    }

    public void asignarSupervisor(TableroTareasID tableroTareasID, SupervisorID supervisorID, Nombre nombre){
        appendChange(new SupervisorAsignado(tableroTareasID, supervisorID, nombre)).apply();
    }

    public void crearTarea(TableroTareasID tableroTareasID, TareaID tareaID, FechaCreacion fechaCreacion, Nombre nombre, Descripcion descripcion){
        appendChange(new TareaCreada(tableroTareasID, tareaID, descripcion, nombre, fechaCreacion)).apply();
    }

    public void asignarTarea(){}

    public void asignarTrabajador(){}

    public void ejecutarTarea(){}

    public void modificarEstadoTarea(){}

    public void modificarDescripcion(){}

    public void modificarNombreTarea(){}

    public List<TableroTareas> listaTableroTarea(){
        return this.tableroTareas;
    }


}
