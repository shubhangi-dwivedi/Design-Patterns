package src.ObserverPattern.Observable;

import src.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserver> observerList= new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    //business logic, if new stock added and previously stockCount=0, notify all observers
    public void setStockCount(int newStockAdded){
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+=newStockAdded;
    }

    public int getStockCount(){
        return stockCount;
    }
}
