package org.example.LowLevelDesign.ObserverPattern;

import org.example.LowLevelDesign.ObserverPattern.Observable.IphoneStockObservableImpl;
import org.example.LowLevelDesign.ObserverPattern.Observable.StockObservable;
import org.example.LowLevelDesign.ObserverPattern.Observer.EmailAlertObserver;
import org.example.LowLevelDesign.ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver emailObserver1 = new EmailAlertObserver("vivek@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(emailObserver1);


        iphoneStockObservable.getStocks();
        iphoneStockObservable.addStocks(10);
        iphoneStockObservable.getStocks();
        iphoneStockObservable.addStocks(10);
        iphoneStockObservable.getStocks();
    }
}
