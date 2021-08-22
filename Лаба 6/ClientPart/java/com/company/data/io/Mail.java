package com.company.data.io;

import com.company.data.Product;

import java.io.Serializable;

/**
 * Objects of this class are sent to server
 */
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;

    //Mail data
    private final String commandName;
    private final Product productArgument;
    private final Integer intArgument;
    private final Long longArgument;
    private final Float floatArgument;

    private boolean connect;


    /**
     * Constructor for commands without arguments
     *
     * @param commandName - command name
     */
    public Mail(String commandName) {
        this.commandName = commandName;
        this.productArgument = null;
        this.floatArgument = null;
        this.intArgument = null;
        this.longArgument = null;
    }


    /**
     * Constructor for commands with Product argument
     *
     * @param commandName     - command name
     * @param productArgument - product arg
     */
    public Mail(String commandName, Product productArgument) {
        this.commandName = commandName;
        this.productArgument = productArgument;
        this.floatArgument = null;
        this.intArgument = null;
        this.longArgument = null;

    }

    /**
     * Constructor for commands with Product argument
     *
     * @param commandName - command name
     * @param intArgument - int arg
     */
    public Mail(String commandName, Integer intArgument) {
        this.commandName = commandName;
        this.intArgument = intArgument;
        this.productArgument = null;
        this.floatArgument = null;
        this.longArgument = null;
    }

    /**
     * Constructor for commands with Product argument
     *
     * @param commandName  - command name
     * @param longArgument - long arg
     */
    public Mail(String commandName, Long longArgument) {
        this.commandName = commandName;
        this.longArgument = longArgument;
        this.productArgument = null;
        this.floatArgument = null;
        this.intArgument = null;
    }

    /**
     * Constructor for commands with Product argument
     *
     * @param commandName   - command name
     * @param floatArgument - float arg
     */
    public Mail(String commandName, Float floatArgument) {
        this.commandName = commandName;
        this.floatArgument = floatArgument;
        this.productArgument = null;
        this.intArgument = null;
        this.longArgument = null;
    }

    public void setConnect(boolean connect) {
        this.connect = connect;
    }
}
