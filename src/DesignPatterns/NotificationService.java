package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject{
    private List<Observer> observerList=new ArrayList<>();
    private String message;
    @Override
    public void subsrcibe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubsribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob:observerList){
            ob.update(message);
        }
    }public void sendNotification(String msg){
        this.message=msg;
        notifyObservers();
    }
}
