package co.com.storecar.model.values;


import co.com.storecar.model.generic.Identity;

public class TareaID extends Identity {
    public TareaID(String tareaID) {
        super(tareaID);
    }

    public TareaID() {}

    public static TareaID of(String tareaID) {
        return new TareaID(tareaID);
    }
}
