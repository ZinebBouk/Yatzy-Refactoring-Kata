package yatzygame.familyscorecategory.specialfamilyscorecategories;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.specialfamilyscorecategories.ChanceScoreCategory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ChanceStrategyTest {

    ChanceScoreCategory chanceStrategy = new ChanceScoreCategory();

    @Test
    public void test_sum_of_different_value_ChanceStrategy(){
        assertThat(
            chanceStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(18);
    }

    @Test
    public void test_sum_of_same_value_ChanceStrategy(){
        assertThat(
            chanceStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.THREE, Dice.THREE, Dice.THREE, Dice.THREE)
            )
        ).isEqualTo(15);
    }
}
