package tournament;

import java.util.*;

import tournament.interfaces.*;

public class Table {

    private HashMap<ITeam, TableEntry> tableEntries = new HashMap<>();
    private final IPointDistributionBehavior pointDistributionBehavior;
    private final ITableEntryComparer tableEntryComparer;
    private final IGoalStatisticCaretaker goalStatisticCaretaker;

    public Table() {
        this.pointDistributionBehavior = new DefaultPointDistributionBehavior();
        this.tableEntryComparer = new DefaultTableEntryComparer();
        this.goalStatisticCaretaker = new DefaultGoalStatisticCaretaker();
    }

    public List<ITableEntry> sortTableEntries() {
        List<ITableEntry> tableEntryList = new ArrayList<>();

        for (TableEntry entry : tableEntries.values()) {
            tableEntryList.add(entry);
        }

        tableEntryList.sort((left, right) -> tableEntryComparer.greaterThan(left, right));

        return tableEntryList;
    }

    public void maintainGoalsStatistic(GameResult result) {
        goalStatisticCaretaker.maintainGoalStatistic(
                getTableEntryForTeam(result.getHomeTeam()),
                result.getHomeTeamGoals(), result.getAwayTeamGoals());

        goalStatisticCaretaker.maintainGoalStatistic(
                getTableEntryForTeam(result.getAwayTeam()),
                result.getAwayTeamGoals(), result.getHomeTeamGoals());
    }

    public void addPointsToTeams(GameResult result) {
        pointDistributionBehavior.addPointsToTableEntries(getTableEntryForTeam(result.getHomeTeam()),
                getTableEntryForTeam(result.getAwayTeam()), result);
    }

    public void createTableEntriesForResultIfNotExistent(GameResult result) {
        ITeam homeTeam = result.getHomeTeam();
        ITeam awayTeam = result.getAwayTeam();

        createTableEntryIfTeamEntryNotExists(homeTeam);
        createTableEntryIfTeamEntryNotExists(awayTeam);
    }

    private void createTableEntryIfTeamEntryNotExists(ITeam team) {
        if (!tableEntries.containsKey(team)) {
            TableEntry entry = new TableEntry();
            entry.setTeam(team);
            tableEntries.put(team, entry);
        }
    }

    public List<ITableEntry> getTable() {
        return sortTableEntries();
    }

    public void bookGameResultToTable(GameResult result) {
        createTableEntriesForResultIfNotExistent(result);
        addPointsToTeams(result);
        maintainGoalsStatistic(result);
    }

    public ITableEntry getTableEntryForTeam(ITeam team) {
        return tableEntries.getOrDefault(team, null);
    }

    public String toString() {
        List<ITableEntry> tableEntries = sortTableEntries();
        StringBuilder tableAsString = new StringBuilder();

        for (ITableEntry entry : tableEntries) {
            tableAsString.append(entry.toString()).append("\n");
        }

        return tableAsString.toString();
    }
}
