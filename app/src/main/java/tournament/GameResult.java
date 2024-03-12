package tournament;

import tournament.interfaces.ITeam;

public class GameResult {

    private final ITeam homeTeam;
    private final ITeam awayTeam;
    private final int homeTeamGoals;
    private final int awayTeamGoals;

    public GameResult(ITeam homeTeam, ITeam awayTeam, int homeTeamGoals, int awayTeamGoals) {
        if (homeTeam == null) {
            throw new RuntimeException("homeTeam can not be null");
        }

        if (awayTeam == null) {
            throw new RuntimeException("awayTeam can not be null");
        }

        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
    }

    public ITeam getHomeTeam() {
        return homeTeam;
    }

    public ITeam getAwayTeam() {
        return awayTeam;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public boolean isDraw() {
        return homeTeamGoals == awayTeamGoals;
    }

    public ITeam getWinningTeam() {
        if (homeTeamGoals > awayTeamGoals) {
            return homeTeam;
        } else if (awayTeamGoals > homeTeamGoals) {
            return awayTeam;
        } else {
            return null; // Return null if it's a draw
        }
    }
}
