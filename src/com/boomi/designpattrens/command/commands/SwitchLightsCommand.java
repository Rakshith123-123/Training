package com.boomi.designpattrens.command.commands;


import com.boomi.designpattrens.command.components.Light;

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }

}