package mx.iteso.observer;


public class Scorer implements Displayable{
    private String NameScorer;
    private int numberScorer;
    private String positionScorer;
    private String team;

    public Scorer(String nameScorer, int numberScorer, String positionScorer, String team) {
        this.NameScorer = nameScorer;
        this.numberScorer = numberScorer;
        this.positionScorer = positionScorer;
        this.team = team;
    }
    
	public void display() {
		System.out.println(NameScorer + " - " + numberScorer + " - " + positionScorer + "-" + team);
		
	}

}
