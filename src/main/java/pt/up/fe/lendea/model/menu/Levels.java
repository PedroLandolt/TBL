package pt.up.fe.lendea.model.menu;

import java.util.Arrays;
import java.util.List;

public class Levels {
    private final List<String> entries;
    private int currentEntry = 0;

    public Levels() {
        this.entries = Arrays.asList("  LEVEL - 1", "  LEVEL - 2", "  LEVEL - 3", " BOSS LEVEL", "    GO BACK");
    }


    public void nextEntry() {
        currentEntry++;
        if (currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return currentEntry == i;
    }
    public boolean isSelectedLevel1() {return isSelected(0);}
    public boolean isSelectedLevel2() {return isSelected(1);}
    public boolean isSelectedLevel3() {return isSelected(2);}
    public boolean isSelectedFinalLevel() {
        return isSelected(3);
    }
    public boolean isSelectedGoBack() {
        return isSelected(4);
    }

    public int getNumberEntries() {
        return this.entries.size();
    }

}
