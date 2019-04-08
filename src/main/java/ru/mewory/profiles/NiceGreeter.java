package ru.mewory.profiles;

public class NiceGreeter implements Greeter {
    public static final String MESSAGE = "Hello, my dear";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
