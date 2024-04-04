package yatzygame.familyscorecategory.straightfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.impl.LargeStraightScoreCategory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LargeStraightStrategyTest {

    LargeStraightScoreCategory largeStraightStrategy = new LargeStraightScoreCategory();

    @Test
    public void test_case_unconventional_values_LargeStraightStrategy(){
        assertThat(
            largeStraightStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isZero();
    }

    @Test
    public void test_case_all_inclusive_values_not_ordered_LargeStraightStrategy(){
        assertThat(
            largeStraightStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.FOUR, Dice.TWO, Dice.SIX, Dice.FIVE)
            )
        ).isEqualTo(LargeStraightScoreCategory.LARGE_STRAIGHT_SCORE);
    }

    @Test
    public void test_case_all_inclusive_values_ordered_LargeStraightStrategy(){
        assertThat(
            largeStraightStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.SIX)
            )
        ).isEqualTo(LargeStraightScoreCategory.LARGE_STRAIGHT_SCORE);
    }
}