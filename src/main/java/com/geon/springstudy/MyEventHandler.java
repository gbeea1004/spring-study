package com.geon.springstudy;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void handler(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("event = " + event.getData());
    }

    @EventListener
    @Async
    public void handler(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("ContextRefreshedEvent");
    }

    @EventListener
    @Async
    public void handler(ContextClosedEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("ContextClosedEvent");
    }
}
