package src.DesignPatterns.behavioralDesginPatters.observerPattern;

import src.DesignPatterns.behavioralDesginPatters.observerPattern.observable.IphoneObservableImpl;
import src.DesignPatterns.behavioralDesginPatters.observerPattern.observable.StockObservable;
import src.DesignPatterns.behavioralDesginPatters.observerPattern.observer.EmailAlertsObserverImpl;
import src.DesignPatterns.behavioralDesginPatters.observerPattern.observer.MobileAlertsObserverImpl;
import src.DesignPatterns.behavioralDesginPatters.observerPattern.observer.NotificationAlertsObserver;

public class Store {
    public static void main(String[] args) {

        StockObservable iphoneStocks = new IphoneObservableImpl();
        NotificationAlertsObserver email = new EmailAlertsObserverImpl(iphoneStocks,"sachin@gmail.com");
        NotificationAlertsObserver mobile = new MobileAlertsObserverImpl(iphoneStocks,"7206530162");

        iphoneStocks.add(email);
        iphoneStocks.add(mobile);

        iphoneStocks.setStockCount(10);
        iphoneStocks.setStockCount(-10);
        iphoneStocks.setStockCount(10);
    }
}
