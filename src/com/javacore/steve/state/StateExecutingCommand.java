package com.javacore.steve.state;

import com.javacore.steve.Application;
import com.javacore.steve.command.CommandRegistry;

public class StateExecutingCommand extends ApplicationState {

    @Override
    public void enter(String commandName) {
        System.out.println();
        CommandRegistry.INSTANCE.getCommand(commandName).execute();
        executeCommand(commandName);
    }

    private void executeCommand(String commandName) {
        CommandRegistry.INSTANCE.getCommand(commandName).execute();
        Application.changeState(new StateIdle(), commandName);
    }


    @Override
    public void onCommand(String commandName) {
        System.out.println("I'm busy executing com.javacore.steve.command " + commandName + ", please, wait...");
    }

    @Override
    public void exit() {
        System.out.println("Leaving the com.javacore.steve.command execution com.javacore.steve.state");
    }
}
