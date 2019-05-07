package ru.mewory.aop.afterreturn;

import lombok.AllArgsConstructor;
import lombok.Setter;


public class MusicPlayer {

    @Setter
    private String genre;

    public String play() {
        return "playing " + genre;
    }

}
