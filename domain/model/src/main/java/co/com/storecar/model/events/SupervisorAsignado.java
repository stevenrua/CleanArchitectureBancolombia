package co.com.storecar.model.events;


import co.com.storecar.model.generic.DomainEvent;
import co.com.storecar.model.values.*;

public class SupervisorAsignado extends DomainEvent {
    private SupervisorID supervisorID;
    private Nombre nombre;
    private TableroTareasID tableroTareasID;


    public SupervisorAsignado(TableroTareasID tableroTareasID, SupervisorID supervisorID, Nombre nombre) {
        super("storecar.supervisorasignado");
        this.tableroTareasID = tableroTareasID;
        this.supervisorID = supervisorID;
        this.nombre = nombre;
    }

    public SupervisorID getSupervisorID() {
        return supervisorID;
    }

    public TableroTareasID getTableroTareasID() {
        return tableroTareasID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
