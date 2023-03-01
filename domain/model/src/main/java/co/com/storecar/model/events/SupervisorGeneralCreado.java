package co.com.storecar.model.events;

import co.com.storecar.model.generic.DomainEvent;
import co.com.storecar.model.values.*;

import java.lang.annotation.Documented;

public class SupervisorGeneralCreado extends DomainEvent {
    private  Nombre nombre;
    private TableroTareasID tableroTareasID;
    private Nombre nombreTablero;
    private FechaCreacion fechaCreacion;

    public SupervisorGeneralCreado() {
        super("storecar.supervisorgeneralcreado");
    }

    public SupervisorGeneralCreado(Nombre nombre, TableroTareasID tableroTareasID, Nombre nombreTablero, FechaCreacion fechaCreacion) {
        super("storecar.supervisorgeneralcreado");
        this.nombre = nombre;
        this.tableroTareasID = tableroTareasID;
        this.nombreTablero = nombreTablero;
        this.fechaCreacion = fechaCreacion;
    }

    public TableroTareasID getTableroTareasID() {
        return tableroTareasID;
    }

    public Nombre getNombreTablero() {
        return nombreTablero;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public void setTableroTareasID(TableroTareasID tableroTareasID) {
        this.tableroTareasID = tableroTareasID;
    }

    public void setNombreTablero(Nombre nombreTablero) {
        this.nombreTablero = nombreTablero;
    }

    public void setFechaCreacion(FechaCreacion fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
