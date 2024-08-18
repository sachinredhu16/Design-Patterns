package src.DesignPatterns.behavioralDesginPatters.observerPattern.observer;

import src.DesignPatterns.behavioralDesginPatters.observerPattern.observable.StockObservable;

public class EmailAlertsObserverImpl implements NotificationAlertsObserver {
    private StockObservable stockObservable = null;
    private String emailId = null;

    public EmailAlertsObserverImpl(StockObservable obj,String emailId) {
        this.stockObservable = obj;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock. Hurry up !");
    }
    private void sendEmail(String emailId,String content){
        System.out.println("An Email has been triggered on : "+emailId);
        System.out.println("Email content : "+content);
        System.out.println();
    }
}
