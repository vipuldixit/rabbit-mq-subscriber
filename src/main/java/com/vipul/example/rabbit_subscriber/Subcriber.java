/*
 * package com.vipul.example.rabbit_subscriber;
 * 
 * import org.springframework.amqp.rabbit.annotation.RabbitListener; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class Subcriber {
 * 
 * @RabbitListener(queues="${jsa.rabbitmq.queue}") public void
 * receivedMessage(String msg) { System.out.println("Received Message: " + msg);
 * }
 * 
 * }
 * 
 */