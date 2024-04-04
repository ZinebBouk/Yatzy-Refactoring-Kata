package yatzygame.familyscorecategory.upletfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.impl.TwoPairsScoreCategory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TwoPairsStrategyTest {

    TwoPairsScoreCategory twoPairsStrategy = new TwoPairsScoreCategory();

    @Test
    public void test_case_contain_two_pairs_TwoPairsStrategy(){
        assertThat(
            twoPairsStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.THREE, Dice.FIVE, Dice.FOUR, Dice.FIVE)
            )
        ).isEqualTo(16);
    }

    @Test
    public void test_case_does_not_contain_two_pairs_TwoPairsStrategy(){
        assertThat(
            twoPairsStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.FOUR, Dice.ONE, Dice.THREE, Dice.FIVE)
            )
        ).isZero();
    }
}
