package ru.mewory.eventpublishing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {

    @Getter
    @Setter
    private String message;

    public MessageEvent(Object source, String msg) {
        super(source);
        this.message = msg;
    }

}
