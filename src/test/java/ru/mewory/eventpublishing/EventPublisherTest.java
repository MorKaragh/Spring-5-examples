package ru.mewory.eventpublishing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EventPublisherTest {

    @Autowired
    private EventPublisher publisher;

    @Autowired
    private Listener listener;

    @Test
    public void publish() {
        String text = "Hello, event publishing!";
        publisher.publish(text);
        assertEquals(text,listener.getRecievedMessage());
    }

}