package co.com.storecar.model.values;



import co.com.storecar.model.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaCreacion implements ValueObject<FechaCreacion.Props> {
    private Date date;
    private String supervisorId;

    public FechaCreacion(){}

    public FechaCreacion(String supervisorId){
        this.date = new Date();
        this.supervisorId = supervisorId;
        System.out.println("fecha creacion si entra: " + this.supervisorId + " Fecha: " + this.date);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String supervisorId() {
                return supervisorId;
            }

            @Override
            public Date date() {
                return date;
            }
        };
    }

    public interface Props {
        String supervisorId();
        Date date();

    }
}
