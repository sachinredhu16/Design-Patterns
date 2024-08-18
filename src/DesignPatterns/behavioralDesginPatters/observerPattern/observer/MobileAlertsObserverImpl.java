package src.DesignPatterns.behavioralDesginPatters.observerPattern.observer;

import src.DesignPatterns.behavioralDesginPatters.observerPattern.observable.StockObservable;

public class MobileAlertsObserverImpl implements NotificationAlertsObserver {
    private StockObservable stockObservable = null;
    private String mobileNo = null;

    public MobileAlertsObserverImpl(StockObservable obj, String mobileNo) {
        this.stockObservable = obj;
        this.mobileNo = mobileNo;
    }

    @Override
    public void update() {
        sendEmail(mobileNo,"Product is in stock. Hurry up !");
    }
    private void sendEmail(String mobileNo,String content){
        System.out.println("A Mobile text msg has been triggered on : "+mobileNo);
        System.out.println("Text content : "+content);
        System.out.println();
    }
}
