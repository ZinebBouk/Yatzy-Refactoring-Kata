package yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.impl;

import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.AbstractStraightFamilyScoreCategory;

import java.util.List;

public class LargeStraightScoreCategoryImpl extends AbstractStraightFamilyScoreCategory {

    public static final int LARGE_STRAIGHT_SCORE = 20;
    public static final List<Integer> LARGE_STRAIGHT = List.of(2, 3, 4, 5, 6);

    @Override
    public int calculateScore(Roll roll) {
        return getScoreOfStraight(roll, LARGE_STRAIGHT_SCORE, LARGE_STRAIGHT);
    }
}
