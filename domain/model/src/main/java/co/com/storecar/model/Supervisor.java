package co.com.storecar.model;


import co.com.storecar.model.generic.*;
import co.com.storecar.model.values.*;
import co.com.storecar.model.values.SupervisorID;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Entity<SupervisorID> {

    private final List<Trabajador> listaTrabajadores;
    private final Nombre nombre;
    public Supervisor(SupervisorID supervisorID, Nombre nombre) {
        super(supervisorID);
        this.nombre = nombre;
        this.listaTrabajadores = new ArrayList<>();
    }

    public void asignarTrabajador(Trabajador trabajador){
        this.listaTrabajadores.add(trabajador);
    }

    public void asignarTareas(List<Tarea> listaTareas){

    }

    public List<Trabajador> listaTrabajadores(){
        return this.listaTrabajadores;
    }

    public Nombre nombre(){
        return this.nombre;
    }
}
