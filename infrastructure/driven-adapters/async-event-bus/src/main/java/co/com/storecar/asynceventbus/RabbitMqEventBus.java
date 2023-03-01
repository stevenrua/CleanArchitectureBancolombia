package co.com.storecar.asynceventbus;

import co.com.storecar.asynceventbus.data.Notification;
import co.com.storecar.model.generic.DomainEvent;
import co.com.storecar.serializer.JSONMapper;
import co.com.storecar.usecase.gateways.EventBus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqEventBus implements EventBus {

    public static final String EXCHANGE = "core-supervisorgeneral-events";
    public static final String ROUTING_KEY = "events.routing.key";
    private final RabbitTemplate rabbitTemplate;
    private final JSONMapper serializer;

    public RabbitMqEventBus(RabbitTemplate rabbitTemplate, JSONMapper serializer) {
        this.rabbitTemplate = rabbitTemplate;
        this.serializer = serializer;
    }

    @Override
    public void publish(DomainEvent event) {
        var notification = new Notification(
                event.getClass().getTypeName(),
                serializer.writeToJson(event)
        );
        rabbitTemplate.convertAndSend(
                this.EXCHANGE, this.ROUTING_KEY, notification.serialize().getBytes()
        );
    }

    @Override
    public void publishError(Throwable errorEvent) {

    }
}
