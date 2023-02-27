package co.com.storecar.model.values;


import co.com.storecar.model.generic.ValueObject;

public class EncargadoID implements ValueObject<String> {
    private final String encargadoID;

    public EncargadoID(String encargadoID){

        this.encargadoID = encargadoID;
    }

    @Override
    public String value() {
        return encargadoID;
    }
}
