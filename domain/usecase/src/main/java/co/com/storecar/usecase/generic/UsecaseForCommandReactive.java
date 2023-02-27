package co.com.storecar.usecase.generic;
import co.com.storecar.model.generic.DomainEvent;
import reactor.core.publisher.*;

public interface UsecaseForCommandReactive <R extends DomainEvent>{
    Flux<DomainEvent> apply(Mono<R> rMono);
}
