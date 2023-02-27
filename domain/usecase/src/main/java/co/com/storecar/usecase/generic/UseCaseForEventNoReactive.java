package co.com.storecar.usecase.generic;

import co.com.storecar.model.generic.DomainEvent;
import java.util.List;

public interface UseCaseForEventNoReactive <R extends DomainEvent>{
    List<DomainEvent> apply(R domainEvent);
}
