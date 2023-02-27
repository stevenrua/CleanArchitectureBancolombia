package co.com.storecar.model.values;


import co.com.storecar.model.generic.Identity;

public class TrabajdorID extends Identity {
    public TrabajdorID(String trabajdorID) {
        super(trabajdorID);
    }

    public TrabajdorID() {}

    public static TrabajdorID of(String trabajdorID) {
        return new TrabajdorID(trabajdorID);
    }
}
