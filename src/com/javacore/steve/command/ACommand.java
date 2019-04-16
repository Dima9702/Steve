package com.javacore.steve.command;


    /**
     * ACommand is an abstract class from which all other specific com.javacore.steve.command subclasses are to inherit.
     * Every com.javacore.steve.command has a name, a description and has an execute() method.
     */


    public abstract class ACommand {
        /**
         * name or alias of the com.javacore.steve.command
         */
        protected String name;
        /**
         * the com.javacore.steve.command description
         */
        protected String description;

        /**
         * Constructs a com.javacore.steve.command.
         *
         * @param name com.javacore.steve.command name.
         */
        public ACommand(String name) {
            this.name = name;
        }

        /**
         * Executes a com.javacore.steve.command. Should be overridden in a specific com.javacore.steve.command subclass.
         */
        public void execute() {
            System.out.println("com.javacore.steve.command \"" + name + "\"is not implemented");
        }
    }


