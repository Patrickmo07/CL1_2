package pe.edu.cibertec.app_rabbit_exm1.equeue.producer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TeslaProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final String EXCHANGE = "prueba_exchange";
    private static final String ROUTING_KEY = "prueba_routing";

    public void enviarMensaje(String mensaje){
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, mensaje);
        log.info("Mensaje construido y enviado a RabbitMQ" + mensaje);
    }
}
