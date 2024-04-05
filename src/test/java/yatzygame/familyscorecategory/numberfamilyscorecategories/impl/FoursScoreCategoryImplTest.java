package yatzygame.familyscorecategory.numberfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.FoursScoreCategoryImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FoursScoreCategoryImplTest {

    FoursScoreCategoryImpl foursStrategy = new FoursScoreCategoryImpl();

    @Test
    public void test_sum_of_one_four_FourStrategy(){
        assertThat(
            foursStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.FOUR, Dice.THREE, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(4);
    }

    @Test
    public void test_sum_without_four_FoursStrategy(){
        assertThat(
            foursStrategy.calculateScore(
                Roll.of(Dice.FIVE, Dice.ONE, Dice.TWO, Dice.THREE, Dice.TWO)
            )
        ).isZero();
    }

    @Test
    public void test_sum_of_more_than_one_of_four_FoursStrategy(){
        assertThat(
            foursStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.FIVE, Dice.FOUR, Dice.FOUR, Dice.FOUR)
            )
        ).isEqualTo(16);
    }
}
