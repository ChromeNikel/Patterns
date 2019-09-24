package com.company.commands;

public class Invoker {
    Command slot;

    public Invoker() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void wordWrote() {
        slot.execute();
    }
}
