package src;

import src.ObserverPattern.Observable.IphoneObservableImpl;
import src.ObserverPattern.Observable.StockObservable;
import src.ObserverPattern.Observer.EmailAlertObserverImpl;
import src.ObserverPattern.Observer.MobileAlertObserverImpl;
import src.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver o1= new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver o2= new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver o3= new MobileAlertObserverImpl("abc", iphoneStockObservable);

        iphoneStockObservable.add(o1);
        iphoneStockObservable.add(o2);
        iphoneStockObservable.add(o3);

        iphoneStockObservable.setStockCount(10);
    }
}