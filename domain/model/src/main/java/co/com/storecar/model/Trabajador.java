package co.com.storecar.model;

import co.com.storecar.model.generic.Entity;
import co.com.storecar.model.values.*;

import java.util.ArrayList;
import java.util.List;

public class Trabajador extends Entity<TrabajdorID> {

    private final List<String> listaTareas = new ArrayList<>();
    private final Nombre nombre;


    public Trabajador(TrabajdorID trabajdorID, String tarea, Nombre nombre) {
        super(trabajdorID);
        this.nombre = nombre;
        this.listaTareas.add(tarea);
    }

    public void ejecutarTareas(){}

    public List<String> listaTareas(){
        return listaTareas;
    }

    public Nombre nombreTrabajador(){
        return nombre;
    }
}
