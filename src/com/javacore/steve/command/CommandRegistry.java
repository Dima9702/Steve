package com.javacore.steve.command;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * The enum, that holds all allowed commands
 * Implements the singleton paradigm, so there can be only one enum member INSTANCE
 */
public enum CommandRegistry {
    INSTANCE;

    /**
     * the Map of all possible commands
     * the keys are the aliases of the commands
     * the com.javacore.steve.command objects are created as values
     */


    private static Map<String, ACommand> commands;


    static {
        commands = new HashMap<>();
        commands.put("version", new com.javacore.steve.command.CommandVersion("version"));
        commands.put("author", new com.javacore.steve.command.CommandAuthor("author"));
        commands.put("creator", new com.javacore.steve.command.CommandAuthor("creator"));
        commands.put("father", new com.javacore.steve.command.CommandAuthor("father"));
    }

    /**
     * checks if the com.javacore.steve.command is supported
     *
     * @param name the name of the com.javacore.steve.command or one of its aliases
     * @return the boolean value of if the com.javacore.steve.command is supported
     */
    public boolean hasCommand(String name) {
        return commands.containsKey(name);
    }

    /**
     * returns the com.javacore.steve.command object by its name
     *
     * @param name the name of the com.javacore.steve.command
     * @return the com.javacore.steve.command object
     */
    public ACommand getCommand(String name) {
        return commands.get(name);
    }

    /**
     * prints out all the supported commands
     */
    public void listCommands() {
        Iterator it = commands.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey());
        }
    }
}
