package co.com.storecar.api.dtos;

import co.com.storecar.model.events.SupervisorGeneralCreado;
import co.com.storecar.model.values.Nombre;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.annotation.Documented;
import java.util.Date;

public class SupervisorGeneralCreadoDTO implements Serializable {

    private String nombre;

    private String area;

    private String tableroTareasID;

    private String nombreTablero;

    private String areaTablero;

    private String fechaCreacion;

    private Date dateFecha;
    public SupervisorGeneralCreadoDTO(SupervisorGeneralCreado supervisorGeneralCreado){
        this.nombre = supervisorGeneralCreado.getNombre().value().nombre();
        this.area = supervisorGeneralCreado.getNombre().value().area();
        this.tableroTareasID = supervisorGeneralCreado.getTableroTareasID().value();
        this.nombreTablero = supervisorGeneralCreado.getNombreTablero().value().nombre();
        this.areaTablero = supervisorGeneralCreado.getNombreTablero().value().area();
        this.fechaCreacion = supervisorGeneralCreado.getFechaCreacion().value().supervisorId();
        this.dateFecha = supervisorGeneralCreado.getFechaCreacion().value().date();

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTableroTareasID() {
        return tableroTareasID;
    }

    public void setTableroTareasID(String tableroTareasID) {
        this.tableroTareasID = tableroTareasID;
    }

    public String getNombreTablero() {
        return nombreTablero;
    }

    public void setNombreTablero(String nombreTablero) {
        this.nombreTablero = nombreTablero;
    }

    public String getAreaTablero() {
        return areaTablero;
    }

    public void setAreaTablero(String areaTablero) {
        this.areaTablero = areaTablero;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getDateFecha() {
        return dateFecha;
    }

    public void setDateFecha(Date dateFecha) {
        this.dateFecha = dateFecha;
    }
}
