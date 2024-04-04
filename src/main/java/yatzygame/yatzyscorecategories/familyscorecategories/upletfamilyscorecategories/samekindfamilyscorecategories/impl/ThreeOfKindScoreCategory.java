package yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl;

import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.AbstractSameKindScoreCategory;

public class ThreeOfKindScoreCategory extends AbstractSameKindScoreCategory {

    @Override
    public int calculateScore(Roll roll) {
        return getScoreOfSameKinds(roll, 3);
    }
}
