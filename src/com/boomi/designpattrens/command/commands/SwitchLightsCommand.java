package com.boomi.designpattrens.command.commands;


import com.boomi.designpattrens.command.components.Light;

public class SwitchLightsCommand implements Command {

    private Light light;

    public SwitchLightsCommand(Light light){
        this.light=light;
    }


    @Override
    public void execute() {
        light.switchLights();
    }

}