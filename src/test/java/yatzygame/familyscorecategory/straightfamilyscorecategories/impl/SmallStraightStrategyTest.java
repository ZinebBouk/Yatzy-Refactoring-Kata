package yatzygame.familyscorecategory.straightfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.impl.SmallStraightScoreCategory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SmallStraightStrategyTest {

    SmallStraightScoreCategory smallStraightStrategy = new SmallStraightScoreCategory();

    @Test
    public void test_case_unconventional_values_SmallStraightStrategy(){
        assertThat(
            smallStraightStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(0);
    }

    @Test
    public void test_case_all_inclusive_values_not_ordered_SmallStraightStrategy(){
        assertThat(
            smallStraightStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.FOUR, Dice.ONE, Dice.THREE, Dice.FIVE)
            )
        ).isEqualTo(SmallStraightScoreCategory.SMALL_STRAIGHT_SCORE);
    }

    @Test
    public void test_case_all_inclusive_values_ordered_SmallStraightStrategy(){
        assertThat(
            smallStraightStrategy.calculateScore(
                Roll.of(Dice.ONE, Dice.TWO, Dice.THREE, Dice.FOUR, Dice.FIVE)
            )
        ).isEqualTo(SmallStraightScoreCategory.SMALL_STRAIGHT_SCORE);
    }
}
