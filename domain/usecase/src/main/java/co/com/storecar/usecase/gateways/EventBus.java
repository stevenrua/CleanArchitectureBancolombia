package co.com.storecar.usecase.gateways;


import co.com.storecar.model.generic.DomainEvent;

public interface EventBus {
    void publish(DomainEvent event);

    void publishError(Throwable errorEvent);
}
