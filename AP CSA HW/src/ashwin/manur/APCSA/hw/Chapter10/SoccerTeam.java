package ashwin.manur.APCSA.hw.Chapter10;

public class SoccerTeam {
	private int wins;
	private int losses;
	private int ties;
	private int points;
	private static int gamesPlayed;
	private static int totalGoals;
	
	public void played(SoccerTeam other, int myScore, int otherScore) {
		if(myScore > otherScore) {
			wins++;
			other.losses++;
		}
		else if(myScore < otherScore) {
			losses++;
			other.wins++;
		}
		else {
			ties++;
			other.ties++;
		}
		totalGoals += myScore + otherScore;
		gamesPlayed++;
	}
	
	public int getPoints() {
		points = (3 * wins) + ties;
		return points;
	}
	public void reset() {
		wins = 0;
		losses = 0;
		ties = 0;
		points = 0;
	}
	
	public static int getGamesPlayed() {
		return gamesPlayed;
	}
	public static int getTotalGoals() {
		return totalGoals;
	}
	
	public static void startTournament() {
		gamesPlayed = 0;
		totalGoals = 0;
	}

}
