package com.boomi.designpattrens.command;

import com.boomi.designpattrens.command.commands.OpenCloseCurtainsCommand;
import com.boomi.designpattrens.command.commands.SwitchLightsCommand;
import com.boomi.designpattrens.command.components.FloorLamp;
import com.boomi.designpattrens.command.components.Room;

public class MainApp {
    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());

    }

}