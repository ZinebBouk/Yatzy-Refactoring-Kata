package yatzygame.familyscorecategory.upletfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.impl.FullHouseScoreCategory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FullHouseStrategyTest {

    FullHouseScoreCategory fullHouseStrategy = new FullHouseScoreCategory();

    @Test
    public void test_case_contain_two_and_three_of_kind_FullHouseStrategy(){
        assertThat(
            fullHouseStrategy.calculateScore(
                Roll.of(Dice.SIX, Dice.TWO, Dice.TWO, Dice.TWO, Dice.SIX)
            )
        ).isEqualTo(18);
    }

    @Test
    public void test_case_does_not_contain_two_and_three_of_kind_FullHouseStrategy(){
        assertThat(
            fullHouseStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.TWO, Dice.THREE, Dice.THREE, Dice.FOUR)
            )
        ).isZero();
    }
}
