
import java.util.ArrayList;
import java.util.List;

public class Game {
    
    private int homeGameID;
    private int visitorGameID;
    private int homeScore;
    private int visitorScore;
    private int currentPeriod;
    private List<Observer> observers = new ArrayList<Observer>();
    
    public Game(int homeGameID, int visitorGameID)
    {
	this.homeGameID = homeGameID;
	this.visitorGameID = visitorGameID;
	homeScore = 0;
	visitorScore = 0;
	currentPeriod = 0;
	
    }
    
    public void updateScore(int hScore, int visScore, int currPeriod) {
	this.homeScore = hScore;
	this.visitorScore = visScore;
	this.currentPeriod = currPeriod;
	notifyAllObservers();
    }
    
    public int getHomeScore(){
	return homeScore;
    }

    public int getVisitorScore(){
	return visitorScore;
    }

    public int getCurrentPeriod(){
	return currentPeriod;
    }

    public void attach(Observer observer) {
	observers.add(observer);
    }

    public void notifyAllObservers() {
	for(Observer observer : observers) {
	    observer.update();
	}
    }

    
}
