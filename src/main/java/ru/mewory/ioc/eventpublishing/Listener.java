package ru.mewory.ioc.eventpublishing;

import lombok.Getter;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Listener implements ApplicationListener<MessageEvent> {

    @Getter
    private String recievedMessage;

    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {
        this.recievedMessage = messageEvent.getMessage();
    }

}
