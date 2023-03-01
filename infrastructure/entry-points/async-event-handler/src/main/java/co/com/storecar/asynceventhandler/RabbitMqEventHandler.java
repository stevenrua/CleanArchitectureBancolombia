package co.com.storecar.asynceventhandler;

import co.com.storecar.asynceventhandler.data.Notification;
import co.com.storecar.serializer.JSONMapper;
import co.com.storecar.serializer.JSONMapperImpl;
import co.com.storecar.usecase.CrearSupervisorGeneralReactivoUseCase;
import co.com.storecar.usecase.command.CrearSupervisorGeneral;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Component
public class RabbitMqEventHandler {
    public static final String EVENTS_QUEUE = "events.queue";

    private final Logger logger = Logger.getLogger("RabbitMqEventHandler");
    private final JSONMapper mapper = new JSONMapperImpl();

    private final CrearSupervisorGeneralReactivoUseCase useCase;

    public RabbitMqEventHandler(CrearSupervisorGeneralReactivoUseCase useCase) {
        this.useCase = useCase;
    }

    @RabbitListener(queues = EVENTS_QUEUE)
    public void listener(String message) throws ClassNotFoundException {
        Notification notification = Notification.from(message);
        if(notification.getType()
                .equals("co.com.storecar.usecase.CrearSupervisorGeneral")){
            logger.info(notification.toString());
            this.useCase.apply(Mono
                            .just((CrearSupervisorGeneral) mapper.readFromJson(notification.getBody(),
                                    CrearSupervisorGeneral.class)))
                    .subscribe();
        }else{
            logger.info("we currently don't have a listener for that event " +notification.toString());
        }
    }
}
