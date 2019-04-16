package com.javacore.steve.command;

import static com.javacore.steve.Application.AUTHOR;

/**
 * Prints the name of the author.
 */
public class CommandAuthor extends ACommand {
    /**The method constructs CommandAuthor.
     * @param name the com.javacore.steve.command name (i.e. the "author" or its aliases)
     */
    public CommandAuthor(String name) {
        super(name);
    }

    /**
     *The method prints out the author name
     */
    @Override
    public void execute() {
        System.out.println("My " + name + " is " + AUTHOR);
    }
}
