package co.com.storecar.usecase.generic;


import co.com.storecar.model.generic.DomainEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public abstract class USeCaseForCommand <R extends Command> implements Function<Mono<R>, Flux<DomainEvent>> {
    public abstract Flux<DomainEvent> apply(Mono<R> rMono);
}
