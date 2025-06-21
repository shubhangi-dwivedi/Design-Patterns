package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.userName=userName;
        this.observable=observable;
    }

    @Override
    public void update(){
        sendMsg("Product is in stock hurry!");
    }

    public void sendMsg(String msg){
        System.out.println("Sending message to "+userName);
    }
}
