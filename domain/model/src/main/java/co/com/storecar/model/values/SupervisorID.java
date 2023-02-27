package co.com.storecar.model.values;


import co.com.storecar.model.generic.Identity;

public class SupervisorID extends Identity {
    public SupervisorID(String supervisorID) {
        super(supervisorID);
    }

    public SupervisorID() {}

    public static SupervisorID of(String supervisorID) {
        return new SupervisorID(supervisorID);
    }
}
