package yatzygame.familyscorecategory.upletfamilyscorecategories.samekindfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl.ThreeOfKindScoreCategoryImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ThreeOfKindScoreCategoryImplTest {

    ThreeOfKindScoreCategoryImpl threeOfKindStrategy = new ThreeOfKindScoreCategoryImpl();

    @Test
    public void test_case_contain_three_of_kind_ThreeOfKindStrategy(){
        assertThat(
            threeOfKindStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.THREE, Dice.THREE, Dice.THREE, Dice.FIVE)
            )
        ).isEqualTo(9);
    }

    @Test
    public void test_case_does_not_contain_three_of_kind_ThreeOfKindStrategy(){
        assertThat(
            threeOfKindStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.FOUR, Dice.ONE, Dice.THREE, Dice.FIVE)
            )
        ).isZero();
    }
}
