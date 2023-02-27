package co.com.storecar.model.events;

import co.com.storecar.model.generic.DomainEvent;
import co.com.storecar.model.values.*;

public class TableroCreado extends DomainEvent {
    private TableroTareasID tableroTareasID;
    private Nombre nombre;
    private FechaCreacion fechaCreacion;
    public TableroCreado(TableroTareasID tableroTareasID, Nombre nombre, FechaCreacion fechaCreacion) {
        super("storecar.tablerocreado");
        this.tableroTareasID = tableroTareasID;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public TableroTareasID getTableroTareasID() {
        return tableroTareasID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }

}
