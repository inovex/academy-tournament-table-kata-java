package tournamanet;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import tournament.Table;
import tournament.interfaces.ITableEntry;

public class TableTest {

    @Test
    void constructor_default_createsEmptyTable() {
        Table table = new Table();

        List<ITableEntry> tableList = table.getTable();

        assertTrue(tableList.isEmpty());
    }
}
