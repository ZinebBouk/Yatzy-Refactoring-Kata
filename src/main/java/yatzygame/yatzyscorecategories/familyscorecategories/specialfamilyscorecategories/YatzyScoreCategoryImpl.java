package yatzygame.yatzyscorecategories.familyscorecategories.specialfamilyscorecategories;

import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.ScoreCategory;

public class YatzyScoreCategoryImpl implements ScoreCategory {

    public static final int YATZY_SCORE = 50;

    @Override
    public int calculateScore(Roll roll) {
        if (roll.getDices().stream().distinct().count() == 1) {
            return YATZY_SCORE;
        }
        return 0;
    }
}
