package com.geon.springstudy;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    public void handle(MyEvent myEvent) {
        System.out.println(Thread.currentThread());
        System.out.println("Another = " + myEvent.getData());
    }
}
