package src.DesignPatterns.behavioralDesginPatters.observerPattern.observable;

import src.DesignPatterns.behavioralDesginPatters.observerPattern.observer.NotificationAlertsObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    private List<NotificationAlertsObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertsObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertsObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertsObserver observer : observerList)
            observer.update();
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0)
            notifySubscribers();
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
