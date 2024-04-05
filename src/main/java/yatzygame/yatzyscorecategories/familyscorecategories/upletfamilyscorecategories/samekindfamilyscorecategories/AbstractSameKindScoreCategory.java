package yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories;

import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.AbstractUpletFamilyScoreCategory;

public abstract class AbstractSameKindScoreCategory extends AbstractUpletFamilyScoreCategory {

    protected int getScoreOfSameKinds(Roll roll, int occurrenceCount) {
        return getCountOccurrences(roll)
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() >= occurrenceCount)
            .mapToInt(entry -> entry.getKey().getValue() * occurrenceCount)
            .max()
            .orElse(0);
    }
}
