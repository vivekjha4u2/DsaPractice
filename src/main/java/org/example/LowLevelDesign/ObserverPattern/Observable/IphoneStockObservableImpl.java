package org.example.LowLevelDesign.ObserverPattern.Observable;

import org.example.LowLevelDesign.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stock;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if(stock == 0) notifySubscribers();
        stock = stockCount;
    }

    @Override
    public void addStocks(int stockCount) {
        if(stock == 0) notifySubscribers();
        stock += stockCount;

    }

    @Override
    public int getStocks() {
        System.out.println(stock);
        return stock;
    }
}
