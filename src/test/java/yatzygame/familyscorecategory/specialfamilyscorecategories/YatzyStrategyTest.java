package yatzygame.familyscorecategory.specialfamilyscorecategories;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.specialfamilyscorecategories.YatzyScoreCategory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class YatzyStrategyTest {

    YatzyScoreCategory yatzyStrategy = new YatzyScoreCategory();

    @Test
    public void test_case_different_value_YatzyStrategy(){
        assertThat(
            yatzyStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(0);
    }

    @Test
    public void test_case_same_value_YatzyStrategy(){
        assertThat(
            yatzyStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.THREE, Dice.THREE, Dice.THREE, Dice.THREE)
            )
        ).isEqualTo(YatzyScoreCategory.YATZY_SCORE);
    }
}
