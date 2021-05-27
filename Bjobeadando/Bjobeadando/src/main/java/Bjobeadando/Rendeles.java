package Bjobeadando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Rendeles implements Subject {
    private UUID rendelesazonosito;
    private ArrayList<Observer> observer;
    private Collection<Termek> termek;
    private Vasarlo vasarlo;
    private Statusz statusz;

    public Rendeles(UUID rendelesazonosito, Collection<Termek> termek, Vasarlo vasarlo) {
        this.rendelesazonosito = rendelesazonosito;
        this.termek = termek;
        this.vasarlo = vasarlo;
        this.statusz = Statusz.Rendeles;
        this.observer = new ArrayList<>();
    }

    public Collection<Termek> getTermek() {
        return termek;
    }

    public void setProducts(Collection<Termek> termek) {
        this.termek = termek;
    }

    public Vasarlo getCustomer() {
        return vasarlo;
    }

    public void setCustomer(Vasarlo vasarlo) {
        this.vasarlo = vasarlo;
    }

    public Statusz getStatusz() {
        return statusz;
    }

    public void setStatusz(Statusz statusz) {
        this.statusz = statusz;
        notifyObservers();
    }

    @Override
    public void set(Observer observer) {
    	this.observer.set(0, observer);
    }
    
    @Override
    public Statusz getState() {
        return statusz;
    }

	@Override
	public void get(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
