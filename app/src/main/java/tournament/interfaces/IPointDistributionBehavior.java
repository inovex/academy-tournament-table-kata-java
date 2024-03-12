package tournament.interfaces;

import tournament.GameResult;

public interface IPointDistributionBehavior {
    public void addPointsToTableEntries(
            ITableEntry homeTeamTableEntry,
            ITableEntry awayTeamTableEntry,
            GameResult gameResult);
}
