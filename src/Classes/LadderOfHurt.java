package Classes;

import java.util.List;

public class LadderOfHurt {
    private List<Integer> level;
    // 0 : non prioritaire, 1 : semi-prioritaire, 2 : prioritaire
    private int priority;

    public LadderOfHurt(List<Integer> level, int priority) {
        this.setLevel(level);
        this.setPriority(priority);
    }

    public List<Integer> getLevel() {
        return level;
    }

    public void setLevel(List<Integer> level) {
        this.level = level;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
