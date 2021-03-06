package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ScoresData implements Subject {
    private ArrayList<Observer> observers;
    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;
    private List<Scorer> scorers;


    public ScoresData() {
        observers = new ArrayList<Observer>();
        scorers = new LinkedList<Scorer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals, this.scorers);
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void setScore( String homeTeam, String awayTeam, int homeGoals, int awayGoals, List<Scorer> scorers){
        this.homeTeam = homeTeam;
        this.awayTeam =  awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers= scorers;
        newScore();
    }
   
}
