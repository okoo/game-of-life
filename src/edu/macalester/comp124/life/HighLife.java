package edu.macalester.comp124.life;

/**
 * Created by oliverkoo on 2/6/14.
 */
public class HighLife implements RuleSet {

    public String getName() {
        return "HighLife's Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     * <p/>
     * //If a living cell has less than 2 living neighbors, it will die (of loneliness).
     * If a living cell has more than 3 living neighbors, it will die (it’s overcrowded).
     * If a dead cell has exactly 3 living neighbors, it will come to life (it is born).
     * Otherwise, the cell’s value will not be changed.
     * any dead cell with 6 living neighbors comes to life
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {


        if (neighborCount < 2) {
            return false;
        } else if (neighborCount == 6) {
            return true;
        } else if (neighborCount > 3) {
            return false;
        } else if (neighborCount == 3) {
            return true;
        } else {
            return isAlive;
        }


    }
}

