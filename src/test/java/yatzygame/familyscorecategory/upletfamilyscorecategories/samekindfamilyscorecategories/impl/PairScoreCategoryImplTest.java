package yatzygame.familyscorecategory.upletfamilyscorecategories.samekindfamilyscorecategories.impl;

import org.junit.Test;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl.PairScoreCategoryImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class PairScoreCategoryImplTest {

    PairScoreCategoryImpl pairStrategy = new PairScoreCategoryImpl();

    @Test
    public void test_case_does_not_contain_pair_PairStrategy(){
        assertThat(
            pairStrategy.calculateScore(
                Roll.of(Dice.TWO, Dice.FOUR, Dice.ONE, Dice.THREE, Dice.FIVE)
            )
        ).isZero();
    }

    @Test
    public void test_case_contain_one_pair_PairStrategy(){
        assertThat(
            pairStrategy.calculateScore(
                Roll.of(Dice.THREE, Dice.FOUR, Dice.THREE, Dice.FIVE, Dice.SIX)
            )
        ).isEqualTo(6);
    }

    @Test
    public void test_case_contain_two_pairs_then_sum_highest_one_PairStrategy(){
        assertThat(
            pairStrategy.calculateScore(
                Roll.of(Dice.FIVE, Dice.THREE, Dice.SIX, Dice.SIX, Dice.FIVE)
            )
        ).isEqualTo(12);
    }
}
