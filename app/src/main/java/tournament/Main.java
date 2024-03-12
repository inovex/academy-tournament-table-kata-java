package tournament;

import tournament.interfaces.ITeam;

public class Main {

    public static void main(String[] args) {
        /*
         * ITeam germany = new Team("Germany");
         * ITeam netherlands = new Team("Netherlands");
         * ITeam england = new Team("England");
         * ITeam italy = new Team("Italy");
         * 
         * Table table = new Table();
         * 
         * // First round
         * GameResult germanAgainstNetherlands = new GameResult(germany, netherlands, 1,
         * 0);
         * GameResult italyAgainstEngland = new GameResult(italy, england, 2, 3);
         * table.bookGameResultToTable(germanAgainstNetherlands);
         * table.bookGameResultToTable(italyAgainstEngland);
         * 
         * // Second round
         * GameResult germanAgainstItaly = new GameResult(germany, italy, 4, 2);
         * GameResult netherlandsAgainstEngland = new GameResult(netherlands, england,
         * 2, 3);
         * table.bookGameResultToTable(germanAgainstItaly);
         * table.bookGameResultToTable(netherlandsAgainstEngland);
         * 
         * // Third round
         * GameResult germanAgainstEngland = new GameResult(germany, england, 1, 0);
         * GameResult italyAgainstNetherlands = new GameResult(italy, netherlands, 2,
         * 2);
         * table.bookGameResultToTable(germanAgainstEngland);
         * table.bookGameResultToTable(italyAgainstNetherlands);
         * 
         * System.out.println(table.toString());
         */

        TableEntry test = new TableEntry();

        test.addGoalsAgainst(3);
        test.addGoalsScored(2);
        test.addPoints(42);
        test.setTeam(new Team("FC Fußball"));

        System.out.println(test.toString());
    }
}
