package com.javacore.steve.command;

import static com.javacore.steve.Application.VERSION;

/**
 * The com.javacore.steve.command that outputs the current version of the program
 */
public class CommandVersion extends ACommand {

    /**
     * constructs the CommandVersion
     * @param name the name of the com.javacore.steve.command (i.e. the "version")
     */
    public CommandVersion(String name){

        super(name);
    }

    /**
     * The method prints out the version of the program
     */
    @Override
    public void execute (){

        System.out.println("My version is " + VERSION);
    }
}

