package co.com.storecar.model.values;



import co.com.storecar.model.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Props> {

    private String nombre;
    private String area;

    public Nombre(){}

    public Nombre(String nombre, String area){
        this.nombre = Objects.requireNonNull(nombre);
        this.area = Objects.requireNonNull(area);
        if(this.nombre.isEmpty() || this.area.isEmpty()){
            throw new IllegalArgumentException("Nombre y Área deben tener un valor");
        }
        if(this.nombre.length() < 9){
            throw new IllegalArgumentException("El nombre debe contener 9 o más caracteres");
        }
    }

    public interface Props {
        String nombre();
        String area();

    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String area() {
                return area;
            }
        };
    }
}
