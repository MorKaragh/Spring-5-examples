package ru.mewory.ioc.autowiretypes;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class HasDifferentConstructorsAndSetters {

    private Foo foo;
    private Bar bar;
    private Baz baz;


    public HasDifferentConstructorsAndSetters(Foo foo, Baz baz){
        System.out.println("called two args constructor (foo, baz)");
        this.foo = foo;
        this.baz = baz;
    }

    public HasDifferentConstructorsAndSetters() {
        System.out.println("called no args constructor");
    }
}
