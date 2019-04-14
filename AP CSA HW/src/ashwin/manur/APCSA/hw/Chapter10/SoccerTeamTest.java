package ashwin.manur.APCSA.hw.Chapter10;

public class SoccerTeamTest {
	public static void main(String[] args) {

		System.out.println("Tournament 1");
		SoccerTeam a = new SoccerTeam();
		SoccerTeam b = new SoccerTeam();
		SoccerTeam c = new SoccerTeam();
		SoccerTeam d = new SoccerTeam();

		a.played(d, 4, 1);
		b.played(c, 2, 3);
		a.played(c, 4, 2);
		b.played(d, 5, 2);

		System.out.println("A Team - Points: " + a.getPoints());
		System.out.println("B Team - Points: " + b.getPoints());
		System.out.println("C Team - Points: " + c.getPoints());
		System.out.println("D Team - Points: " + d.getPoints());

		System.out.println("Total goals scored: " + SoccerTeam.getTotalGoals());
		System.out.println("Total games played: " + SoccerTeam.getGamesPlayed());

		System.out.println();
		System.out.println("Starting a round robin league");
		roundRobinLeague(7);

	}

	public static void roundRobinLeague(int teams) {
		SoccerTeam[] rrLeague = new SoccerTeam[teams];
		for (int i = 0; i < teams; i++) {
			rrLeague[i] = new SoccerTeam();
		}

		for (int t = 0; t < teams; t++) {
			for (int o = t + 1; o < teams; o++) {
				rrLeague[t].played(rrLeague[o], (int) (Math.random() * 6), (int) (Math.random() * 6));
			}
		}

		for (int i = 0; i < teams; i++) {
			System.out.println("Team " + (i + 1) + " - Points: " + rrLeague[i].getPoints());

		}
		System.out.println("Total goals scored: " + SoccerTeam.getTotalGoals());
		System.out.println("Total games played: " + SoccerTeam.getGamesPlayed());
	}
}
