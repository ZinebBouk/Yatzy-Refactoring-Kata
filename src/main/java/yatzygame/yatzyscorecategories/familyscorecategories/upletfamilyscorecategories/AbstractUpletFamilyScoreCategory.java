package yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories;

import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.ScoreCategory;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractUpletFamilyScoreCategory implements ScoreCategory {

    protected Map<Dice, Long> getCountOccurrences(Roll roll) {
        return roll.getDices()
            .stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}
