package yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories;

import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.ScoreCategory;

public abstract class AbstractNumberFamilyScoreCategory implements ScoreCategory {

    protected int getScoreFromNumber(Roll roll, int number) {
        return roll.getDices()
            .stream()
            .mapToInt(Dice::getValue)
            .filter(value -> value == number)
            .sum();
    }
}
