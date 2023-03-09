package com.boomi.designpattrens.observer;


import static com.boomi.designpattrens.observer.Event.NEW_ITEM;
import static com.boomi.designpattrens.observer.Event.SALE;

public class MainApp {
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("abc@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("abc@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("abc@like.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("abcd"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("abc@like.com"));
        store.salePromotion();

    }

}