package org.example.Listeners;

import org.example.Event.CheckoutEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {
    @KafkaListener(topics = "checkout-topic", groupId = "notification-group")
    public void handleCheckoutEvent(String event) {
        System.out.println("Event received" + event);
        //System.out.println("User " + event.getUserId() + " has checked out with items: " + event.getItem());
    }
}
