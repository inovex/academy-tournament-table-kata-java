package tournament;

import tournament.interfaces.IGoalStatisticCaretaker;
import tournament.interfaces.ITableEntry;

public class DefaultGoalStatisticCaretaker implements IGoalStatisticCaretaker {

    @Override
    public void maintainGoalStatistic(ITableEntry tableEntry, int scoredGoals, int takenGoals) {
        // TODO
        // this method should add the scored and taken goals to the table entry
        throw new UnsupportedOperationException("Unimplemented method 'maintainGoalStatistic'");
    }

}
