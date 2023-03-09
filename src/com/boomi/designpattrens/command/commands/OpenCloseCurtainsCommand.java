package com.boomi.designpattrens.command.commands;

import com.boomi.designpattrens.command.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

    @Override
    public void execute() {
        curtains.openClose();
    }

}