package com.javagda21.wzorce.zad1;

public class GeneratorTicketow {
    private static GeneratorTicketow ourInstance = new GeneratorTicketow();

    public static GeneratorTicketow getInstance() {
        return ourInstance;
    }

    private GeneratorTicketow() {
    }
}
