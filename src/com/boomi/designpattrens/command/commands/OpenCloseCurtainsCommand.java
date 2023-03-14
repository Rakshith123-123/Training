package com.boomi.designpattrens.command.commands;

import com.boomi.designpattrens.command.components.Curtains;

public class OpenCloseCurtainsCommand implements Command {

    private Curtains curtains;

    public OpenCloseCurtainsCommand(Curtains curtains){
        this.curtains=curtains;
    }

    @Override
    public void execute() {
        curtains.openClose();
    }

}