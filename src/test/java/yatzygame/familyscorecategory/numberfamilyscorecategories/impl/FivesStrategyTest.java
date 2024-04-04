package yatzygame.familyscorecategory.numberfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.FivesScoreCategory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FivesStrategyTest {

    FivesScoreCategory fivesStrategy = new FivesScoreCategory();

    @Test
    public void test_sum_of_one_five_FivesStrategy() {
        assertThat(
            fivesStrategy.calculateScore(Roll.of(Dice.FOUR, Dice.FOUR, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(5);
    }

    @Test
    public void test_sum_without_five_FivesStrategy() {
        assertThat(
            fivesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.ONE, Dice.TWO, Dice.ONE, Dice.TWO)
            )
        ).isZero();
    }

    @Test
    public void test_sum_of_more_than_one_of_five_FivesStrategy() {
        assertThat(
            fivesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.FIVE, Dice.TWO, Dice.FIVE, Dice.FIVE)
            )
        ).isEqualTo(15);
    }
}
