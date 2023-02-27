package co.com.storecar.usecase.generic;


import co.com.storecar.model.generic.DomainEvent;

import java.util.List;

public interface UseCaseForCommandNoReactive <R extends Command>{
    List<DomainEvent> apply(R command);
}
