package yatzygame.familyscorecategory.numberfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.TwosScoreCategoryImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TwosScoreCategoryImplTest {

    TwosScoreCategoryImpl twosStrategy = new TwosScoreCategoryImpl();

    @Test
    public void test_sum_of_one_two_TwosStrategy(){
        assertThat(
            twosStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(2);
    }

    @Test
    public void test_sum_without_two_TwosStrategy(){
        assertThat(
            twosStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.ONE, Dice.THREE, Dice.FOUR, Dice.FIVE)
            )
        ).isZero();
    }

    @Test
    public void test_sum_of_more_than_one_of_two_TwosStrategy(){
        assertThat(
            twosStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.FIVE, Dice.TWO, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(6);
    }
}
