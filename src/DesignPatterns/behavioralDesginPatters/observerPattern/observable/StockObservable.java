package src.DesignPatterns.behavioralDesginPatters.observerPattern.observable;

import src.DesignPatterns.behavioralDesginPatters.observerPattern.observer.NotificationAlertsObserver;

public interface StockObservable {

    void add(NotificationAlertsObserver notificationAlertsObserver);

    void remove(NotificationAlertsObserver notificationAlertsObserver);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();

}
