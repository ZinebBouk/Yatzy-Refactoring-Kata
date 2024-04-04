package yatzygame.familyscorecategory.upletfamilyscorecategories.samekindfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl.FourOfKindScoreCategory;

import static org.assertj.core.api.Assertions.assertThat;

public class FourOfKindStrategyTest {

    FourOfKindScoreCategory fourOfKindStrategy = new FourOfKindScoreCategory();

    @Test
    public void test_case_contain_four_of_kind_FourOfKindStrategy(){
        assertThat(
            fourOfKindStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.THREE, Dice.THREE, Dice.THREE, Dice.FIVE)
            )
        ).isEqualTo(12);
    }

    @Test
    public void test_case_does_not_contain_four_of_kind_FourOfKindStrategy(){
        assertThat(
            fourOfKindStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.FOUR, Dice.ONE, Dice.THREE, Dice.FIVE)
            )
        ).isZero();
    }
}
