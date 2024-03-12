package tournament.interfaces;

public interface ITableEntry {
    void addPoints(int points);

    int getPoints();

    void addGoalsScored(int goalsScored);

    int getGoalsScored();

    void addGoalsAgainst(int goalsAgainst);

    int getGoalsAgainst();

    void setTeam(ITeam team);

    ITeam getTeam();

    String toString();
}
