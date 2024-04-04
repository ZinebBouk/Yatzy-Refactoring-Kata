package yatzygame.familyscorecategory.numberfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.SixesScoreCategoryImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SixesScoreCategoryImplTest {

    SixesScoreCategoryImpl sixesStrategy = new SixesScoreCategoryImpl();

    @Test
    public void test_sum_of_one_six_SixesStrategy(){
        assertThat(
            sixesStrategy.calculateScore(Roll.of(Dice.FOUR, Dice.SIX, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(6);
    }

    @Test
    public void test_sum_without_six_SixesStrategy(){
        assertThat(
            sixesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.ONE, Dice.THREE, Dice.TWO, Dice.TWO)
            )
        ).isZero();
    }

    @Test
    public void test_sum_of_more_than_one_of_six_SixesStrategy(){
        assertThat(
            sixesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.SIX, Dice.TWO, Dice.SIX, Dice.FIVE)
            )
        ).isEqualTo(12);
    }
}
