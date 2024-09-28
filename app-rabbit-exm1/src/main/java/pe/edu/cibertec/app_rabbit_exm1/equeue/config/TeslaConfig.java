package pe.edu.cibertec.app_rabbit_exm1.equeue.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TeslaConfig {

    @Bean
    public Queue queue(){
        return new Queue("prueba_queue", false);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("prueba_exchange");
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).
                with("prueba_routing");
    }
}
