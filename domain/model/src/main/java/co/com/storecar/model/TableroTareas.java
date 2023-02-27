package co.com.storecar.model;

import co.com.storecar.model.generic.Entity;
import co.com.storecar.model.values.*;

import java.util.ArrayList;
import java.util.List;

public class TableroTareas extends Entity<TableroTareasID> {

    protected List<Supervisor> listaSupevisores;
    protected List<Tarea> listaTareas;
    private Nombre nombre;
    private final FechaCreacion fechaCreacion;
    public TableroTareas(TableroTareasID tableroTareasID, Nombre nombre, FechaCreacion fechaCreacion) {
        super(tableroTareasID);
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.listaSupevisores = new ArrayList<>();
        this.listaTareas = new ArrayList<>();
    }

    public void asignarSupervisor(Supervisor supervisor){

        this.listaSupevisores.add(supervisor);
    }
    public void crearTareas(Tarea tarea){
        this.listaTareas.add(tarea);
    }

    public List<Supervisor> listaSupervisores(){
        return this.listaSupevisores;
    }

    public List<Tarea> listaTareas(){
        return this.listaTareas;
    }

    public FechaCreacion fechaCreacion(){
        return this.fechaCreacion;
    }
}
