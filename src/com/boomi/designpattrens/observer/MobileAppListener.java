package com.boomi.designpattrens.observer;

public class MobileAppListener implements Listener {

    public String username;

    public MobileAppListener(String username) {
        this.username=username;
    }

    @Override
    public void update(Event eventType) {
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to " + username + " concerning " + eventType);
    }

}