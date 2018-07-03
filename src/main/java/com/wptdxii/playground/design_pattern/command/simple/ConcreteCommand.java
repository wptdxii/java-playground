package com.wptdxii.playground.design_pattern.command.simple;

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.action();
    }
}