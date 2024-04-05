package yatzygame.familyscorecategory.numberfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.OnesScoreCategoryImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OnesScoreCategoryImplTest {

    OnesScoreCategoryImpl onesStrategy = new OnesScoreCategoryImpl();

    @Test
    public void test_sum_of_one_one_OnesStrategy(){
        assertThat(
            onesStrategy.calculateScore(
                Roll.of(Dice.ONE, Dice.TWO, Dice.FOUR, Dice.FIVE, Dice.TWO)
            )
        ).isEqualTo(1);
    }

    @Test
    public void test_sum_without_one_OnesStrategy(){
        assertThat(
            onesStrategy.calculateScore(
                Roll.of(Dice.FOUR, Dice.THREE, Dice.THREE, Dice.TWO, Dice.FIVE)
            )
        ).isZero();
    }

    @Test
    public void test_sum_of_more_than_one_of_one_OnesStrategy(){
        assertThat(
            onesStrategy.calculateScore(
                Roll.of(Dice.ONE, Dice.FIVE, Dice.ONE, Dice.FIVE, Dice.ONE)
            )
        ).isEqualTo(3);
    }
}
