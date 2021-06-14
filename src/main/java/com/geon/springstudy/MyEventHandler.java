package com.geon.springstudy;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void onApplicationEvent(MyEvent event) {
        System.out.println("event = " + event.getData());
    }
}
