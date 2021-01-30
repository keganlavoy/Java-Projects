public class GameObserver extends Observer {

    public GameObserver(Game game) {
	this.game = game;
	this.game.attach(this);
    }


    public void update() {
	System.out.println("Home score: " + game.getHomeScore());
	System.out.println("Visitor score: " + game.getVisitorScore());
	System.out.println("Current period: " + game.getCurrentPeriod());
    }
}    
