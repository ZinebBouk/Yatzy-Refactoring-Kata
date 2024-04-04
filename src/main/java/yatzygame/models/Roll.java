package yatzygame.models;

import java.util.List;

public class Roll {

    private final List<Dice> dices;

    private Roll(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
        this.dices = List.of(d1, d2, d3, d4, d5);
    }

    public static Roll of(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5) {
        return new Roll(d1, d2, d3, d4, d5);
    }

    public List<Dice> getDices() {
        return dices;
    }

}
