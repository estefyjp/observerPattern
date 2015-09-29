package mx.iteso.observer;

import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;
import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();


        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);

        List<Scorer> scorersIT= new ArrayList<Scorer>();
        List<Scorer> scorersChivasQue= new ArrayList<Scorer>();
        List<Scorer> scorersLGMA= new ArrayList<Scorer>();

        scorersIT.add(new Scorer("Juna", 7, "Delantero", "Chivas"));

        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1, scorersIT);
        scoresData.setScore("Chivas", "Queretaro", 2, 1, scorersChivasQue);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0, scorersLGMA);
    }
}
