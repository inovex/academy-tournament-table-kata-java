package tournament;

import tournament.interfaces.ITableEntry;
import tournament.interfaces.ITeam;

public class TableEntry implements ITableEntry {
    private ITeam team;

    private int goalsScored = 0;
    private int goalsAgainst = 0;

    private int points = 0;

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public int getGoalsScored() {
        return goalsScored;
    }

    @Override
    public void addGoalsScored(int goalsScored) {
        this.goalsScored += goalsScored;
    }

    @Override
    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    @Override
    public void addGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst += goalsAgainst;
    }

    @Override
    public ITeam getTeam() {
        return team;
    }

    @Override
    public void setTeam(ITeam team) {
        this.team = team;
    }

    @Override
    public String toString() {
        String result = "";

        result += this.team.getName();
        result += " ";
        result += this.points;
        result += " ";
        result += this.goalsScored;
        result += ":";
        result += this.goalsAgainst;

        return result;
    }
}
