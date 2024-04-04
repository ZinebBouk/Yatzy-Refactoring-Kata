package yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.impl;

import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.AbstractUpletFamilyScoreCategory;

import java.util.Map;

public class TwoPairsScoreCategory extends AbstractUpletFamilyScoreCategory {

    @Override
    public int calculateScore(Roll roll) {
        Map<Dice, Long> occurrences = getCountOccurrences(roll);
        occurrences.entrySet()
            .removeIf(entry -> entry.getValue() < 2);

        if (occurrences.values().size() == 2) {
            return occurrences.keySet()
                .stream()
                .mapToInt(Dice::getValue)
                .sum() * 2;
        }
        return 0;
    }
}
