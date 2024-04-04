package yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories;

import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.ScoreCategory;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractStraightFamilyScoreCategory implements ScoreCategory {

    protected int getScoreOfStraight(Roll roll, int score, List<Integer> expectedList){
        List<Integer> dicesValue = roll.getDices()
            .stream()
            .mapToInt(Dice::getValue)
            .boxed()
            .collect(Collectors.toList());

        if (dicesValue.containsAll(expectedList)) {
            return score;
        }
        return 0;
    }
}
