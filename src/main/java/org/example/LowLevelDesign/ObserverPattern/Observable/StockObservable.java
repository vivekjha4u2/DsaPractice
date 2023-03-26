package org.example.LowLevelDesign.ObserverPattern.Observable;

import org.example.LowLevelDesign.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int stockCount);
    void addStocks(int stockCount);
    int getStocks();
}
