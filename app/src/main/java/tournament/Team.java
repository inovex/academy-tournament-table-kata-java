package tournament;

import tournament.interfaces.ITeam;

public class Team implements ITeam {

    private final String name;

    public Team(String _name) {
        this.name = _name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
