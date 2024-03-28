package edu.tareas.listatareas.broker;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory; // impartante esta libreria
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setPort(5672);
        return connectionFactory;
    }

    @Bean
    public Queue testQueue(){
        return new Queue("Queue queue-notas-process",true);

    }
    @Bean
    DirectExchange exchange ()
    {
        return new DirectExchange("exchange-notas-process");

    }

    @Bean
    Binding testBinding (Queue testQueue, DirectExchange  exchange){
        return BindingBuilder.bind(testQueue).to(exchange).with("notas");
    }

}
