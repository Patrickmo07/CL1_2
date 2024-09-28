package pe.edu.cibertec.app_rabbit_exm1.equeue.cosumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TeslaConsumer {
    @RabbitListener(queues = "demo_queue")
    public void consumirMensaje(String mensaje){
        log.info("Mensaje recibido,"+mensaje+" inicio de operacion");
    }
}
