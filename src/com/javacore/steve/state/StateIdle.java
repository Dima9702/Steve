package com.javacore.steve.state;

import com.javacore.steve.Application;

public class StateIdle extends ApplicationState {

    @Override
    public void enter(String commandName) {
        System.out.println("Entering idle com.javacore.steve.state");
    }

    @Override
    public void onCommand(String commandName) {
        System.out.println("New com.javacore.steve.command received, starting execution " + commandName);
        Application.changeState(new StateExecutingCommand(), commandName);
    }

    @Override
    public void exit() {
        System.out.println("Exiting idle com.javacore.steve.state");
    }
}
