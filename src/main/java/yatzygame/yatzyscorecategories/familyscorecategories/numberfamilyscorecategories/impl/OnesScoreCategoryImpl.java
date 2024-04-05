package yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl;

import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.AbstractNumberFamilyScoreCategory;

public class OnesScoreCategoryImpl extends AbstractNumberFamilyScoreCategory {

    @Override
    public int calculateScore(Roll roll) {
        return getScoreFromNumber(roll, 1);
    }
}
