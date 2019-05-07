package ru.mewory.aop.afterreturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MusicPlayerTest {

    @Autowired
    private MusicPlayer musicPlayer;

    @Test
    public void play() {
        musicPlayer.setGenre("rock");
        musicPlayer.play();

        musicPlayer.setGenre("russian rap");
        try {
            musicPlayer.play();
            fail();
        } catch (Error e) {
            System.out.println("ok, ok, no russian rap");
        }
    }
}