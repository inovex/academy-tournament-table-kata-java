package tournament;

import java.time.Year;

import tournament.interfaces.ICoefficientClient;
import tournament.interfaces.ITableEntry;
import tournament.interfaces.ITableEntryComparer;

public class DefaultTableEntryComparer implements ITableEntryComparer {

    // Will be needed in exercise 6
    private final ICoefficientClient _coefficientClient;

    public DefaultTableEntryComparer() {
        this._coefficientClient = null;
    }

    public DefaultTableEntryComparer(ICoefficientClient coefficientClient) {
        this._coefficientClient = coefficientClient;
    }

    @Override
    public int greaterThan(ITableEntry leftTableEntry, ITableEntry rightTableEntry) {
        return leftTableEntry.getTeam().getName().compareTo(rightTableEntry.getTeam().getName());
    }
}
