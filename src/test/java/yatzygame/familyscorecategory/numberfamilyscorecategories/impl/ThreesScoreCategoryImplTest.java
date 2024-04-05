package yatzygame.familyscorecategory.numberfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.ThreesScoreCategoryImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ThreesScoreCategoryImplTest {

    ThreesScoreCategoryImpl threesStrategy = new ThreesScoreCategoryImpl();

    @Test
    public void test_sum_of_one_three_ThreesStrategy(){
        assertThat(
            threesStrategy.calculateScore(Roll.of(Dice.FOUR, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(3);
    }

    @Test
    public void test_sum_without_three_ThreesStrategy(){
        assertThat(
            threesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.ONE, Dice.TWO, Dice.ONE, Dice.FIVE)
            )
        ).isZero();
    }

    @Test
    public void test_sum_of_more_than_one_of_three_ThreesStrategy(){
        assertThat(
            threesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.TWO, Dice.THREE, Dice.THREE)
            )
        ).isEqualTo(9);
    }
}
