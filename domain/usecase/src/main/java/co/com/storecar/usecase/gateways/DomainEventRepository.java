package co.com.storecar.usecase.gateways;

import co.com.storecar.model.generic.DomainEvent;
//import co.com.storecar.usecase.exception.JSONSerilizationException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DomainEventRepository {
    Flux<DomainEvent> findById(String aggregateId);
    Mono<DomainEvent> saveEvent(DomainEvent event); //throws JSONSerilizationException;
}
