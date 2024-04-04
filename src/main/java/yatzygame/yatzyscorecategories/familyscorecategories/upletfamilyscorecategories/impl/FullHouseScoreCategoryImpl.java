package yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.impl;

import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.AbstractUpletFamilyScoreCategory;

import java.util.List;
import java.util.Map;

public class FullHouseScoreCategoryImpl extends AbstractUpletFamilyScoreCategory {

    public static final List<Long> FULL_HOUSE_LIST = List.of(2L, 3L);

    @Override
    public int calculateScore(Roll roll) {
        Map<Dice, Long> occurrences = getCountOccurrences(roll);

        if (occurrences.values().containsAll(FULL_HOUSE_LIST)) {
            return occurrences
                .entrySet()
                .stream()
                .mapToInt(entry -> entry.getKey().getValue() * entry.getValue().intValue())
                .sum();
        }

        return 0;
    }
}
