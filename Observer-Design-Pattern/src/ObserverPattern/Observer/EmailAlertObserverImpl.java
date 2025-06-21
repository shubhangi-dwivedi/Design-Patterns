package src.ObserverPattern.Observer;

import src.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update(){
        sendMail("Product is in stock hurry!");
    }

    public void sendMail(String msg){
        System.out.println("Sending email to " + emailId);
    }
}
