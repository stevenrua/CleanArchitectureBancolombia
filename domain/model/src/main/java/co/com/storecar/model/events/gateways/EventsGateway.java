package co.com.storecar.model.events.gateways;

import reactor.core.publisher.Mono;

public interface EventsGateway {
    Mono<Void> emit(Object event);
}
