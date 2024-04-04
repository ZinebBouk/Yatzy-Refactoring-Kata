package yatzygame.yatzyscorecategories.familyscorecategories.specialfamilyscorecategories;

import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.ScoreCategory;

public class ChanceScoreCategory implements ScoreCategory {

    @Override
    public int calculateScore(Roll roll) {
        return roll.getDices()
            .stream()
            .mapToInt(Dice::getValue)
            .sum();
    }
}
