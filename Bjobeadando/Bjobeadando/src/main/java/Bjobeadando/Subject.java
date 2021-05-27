package Bjobeadando;

public interface Subject {
    void set(Observer observer);
    void get(Observer observer);
    void notifyObservers();
    Statusz getState();
}
