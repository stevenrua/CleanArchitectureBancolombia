package co.com.storecar.api;

import co.com.storecar.api.dtos.SupervisorGeneralCreadoDTO;
import co.com.storecar.model.events.SupervisorGeneralCreado;
import co.com.storecar.usecase.CrearSupervisorGeneralReactivoUseCase;
import co.com.storecar.usecase.command.CrearSupervisorGeneral;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {
    //private ObjectMapper mapper = new ObjectMapper();
    @Bean
    public RouterFunction<ServerResponse> routerFunction(CrearSupervisorGeneralReactivoUseCase usecase) {
        //mapper.registerModule(new JavaTimeModule());
        return route(POST("/api/usecase/crearsupervisorgeneral2"), request -> {
            return usecase
                    .apply(request.bodyToMono(CrearSupervisorGeneral.class))
                    .collectList()
                    .flatMap(event-> {
                        SupervisorGeneralCreadoDTO eventoDTO = new SupervisorGeneralCreadoDTO((SupervisorGeneralCreado) event.get(0));
                        //SupervisorGeneralCreadoDTO eventoDTO = new SupervisorGeneralCreadoDTO();
                                return ServerResponse.ok().bodyValue(eventoDTO);
                    }
                    );
        });
    }
}
