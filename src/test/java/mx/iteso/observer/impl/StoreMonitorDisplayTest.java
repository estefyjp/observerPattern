package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.observer.Scorer;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;
    private ArrayList<Scorer> scorers;


    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        scorers = new ArrayList<Scorer>(scorers);

    }

    @Test
    public void testUpdate() {
        ArrayList<Scorer> scorersIT= new ArrayList<Scorer>();
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, scorersIT);
        //Nothing to assert or verify for now
    }
}
