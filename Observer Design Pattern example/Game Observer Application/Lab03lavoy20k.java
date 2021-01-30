public class Lab03lavoy20k {

    public static void main(String[] args) {

	GameCenter gameCenter = new GameCenter();

	int tml = gameCenter.getTeamID("Toronto Maple Leafs");
	int mc = gameCenter.getTeamID("Montreal Canadiens");
	int eo = gameCenter.getTeamID("Edmonton Oilers");
	int vc = gameCenter.getTeamID("Vancouver Canucks");
	int cf = gameCenter.getTeamID("Calgary Flames");
	int os = gameCenter.getTeamID("Ottawa Senators");

	Game game1 = new Game(tml, mc);
	Game game2 = new Game(eo, vc);
	Game game3 = new Game(cf, os);


	gameCenter.addGame(game1);
	gameCenter.addGame(game2);
	gameCenter.addGame(game3);

	System.out.println("(Should only update game 1 scores)");
	new GameObserver(game1);
	game1.updateScore((game1.getHomeScore() + 1), game1.getVisitorScore(), game1.getCurrentPeriod() + 1);
	game2.updateScore(game2.getHomeScore(), (game2.getVisitorScore() + 1), game2.getCurrentPeriod() + 1);
	game3.updateScore(game3.getHomeScore(), (game3.getVisitorScore() + 1), game3.getCurrentPeriod() + 1);
	game1.updateScore((game1.getHomeScore() + 1), game1.getVisitorScore(), game1.getCurrentPeriod());
	game1.updateScore((game1.getHomeScore()), (game1.getVisitorScore() + 1), game1.getCurrentPeriod() + 1);

	
    }
}
