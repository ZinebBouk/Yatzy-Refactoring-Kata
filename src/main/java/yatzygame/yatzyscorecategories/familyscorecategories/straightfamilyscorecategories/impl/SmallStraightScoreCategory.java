package yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.impl;

import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.AbstractStraightFamilyScoreCategory;

import java.util.List;

public class SmallStraightScoreCategory extends AbstractStraightFamilyScoreCategory {

    public static final int SMALL_STRAIGHT_SCORE = 15;
    public static final List<Integer> SMALL_STRAIGHT_LIST = List.of(1, 2, 3, 4, 5);

    @Override
    public int calculateScore(Roll roll) {
        return getScoreOfStraight(roll, SMALL_STRAIGHT_SCORE, SMALL_STRAIGHT_LIST);
    }
}
