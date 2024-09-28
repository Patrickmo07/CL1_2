package pe.edu.cibertec.app_rabbit_exm1.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_rabbit_exm1.equeue.producer.TeslaProducer;

@RequiredArgsConstructor
@RestController
public class TeslaController {

    private final TeslaProducer teslaProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje){
        teslaProducer.enviarMensaje(mensaje);
        return "Mensaje construido a RabbitMQ: "+ mensaje;
    }

}
