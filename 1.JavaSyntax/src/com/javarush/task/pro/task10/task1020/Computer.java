package com.javarush.task.pro.task10.task1020;

public class Computer {
    private Keyboard keyboard ;
    private Monitor monitor;
    private Mouse mouse;
    private SystemUnit systemUnit;

    public Computer() {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse =  new Mouse();
        SystemUnit systemUnit = new SystemUnit();
    }
}
