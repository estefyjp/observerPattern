package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class ScoresDataTest {
    ScoresData scoresData;
    Observer observer;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        observer = mock(Observer.class);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void testSetScore() {
        List<Scorer> scorersIT= new ArrayList<Scorer>();
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);
        scoresData.setScore("testTeam", "testTeam2", 1, 0, scorersIT);
        verify(observer, times(2)).update("testTeam", "testTeam2", 1, 0, scorersIT);
    }
}
