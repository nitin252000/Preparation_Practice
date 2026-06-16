package DesignPatterns;

public interface Subject {
    void subsrcibe(Observer observer);
    void unsubsribe(Observer observer);
    void notifyObservers();
}
