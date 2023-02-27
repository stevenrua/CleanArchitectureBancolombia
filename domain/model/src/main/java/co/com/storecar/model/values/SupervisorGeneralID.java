package co.com.storecar.model.values;


import co.com.storecar.model.generic.Identity;

public  class SupervisorGeneralID extends Identity {

    public SupervisorGeneralID(){}

    private SupervisorGeneralID(String id){
        super(id);
    }

    public static SupervisorGeneralID of(String supervisorGeneralID) {
        return new SupervisorGeneralID(supervisorGeneralID);
    }
}
