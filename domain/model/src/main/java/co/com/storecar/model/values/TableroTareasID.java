package co.com.storecar.model.values;


import co.com.storecar.model.generic.Identity;

public class TableroTareasID extends Identity {
    public TableroTareasID(String tableroTareasID) {
        super(tableroTareasID);
    }

    public TableroTareasID() {}

    public static TableroTareasID of(String tableroTareasID) {
        return new TableroTareasID(tableroTareasID);
    }
}
