package com.boomi.designpattrens.observer;

public class EmailMsgListener implements Listener {

    public String email;

    public EmailMsgListener(String email) {
        this.email=email;
    }

    @Override
    public void update(Event eventType) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }

}