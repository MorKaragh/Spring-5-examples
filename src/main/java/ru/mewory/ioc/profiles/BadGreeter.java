package ru.mewory.ioc.profiles;

public class BadGreeter implements Greeter {
    public static final String MESSAGE = "Go to hell!";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
