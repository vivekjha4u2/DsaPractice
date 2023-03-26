package org.example.LowLevelDesign.ObserverPattern.Observer;

import org.example.LowLevelDesign.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String email;
    StockObservable observable;

    public EmailAlertObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email) {
        System.out.println("EMAIL SENT TO "+  email);
    }
}
