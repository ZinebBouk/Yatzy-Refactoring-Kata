package yatzygame.models;


import yatzygame.yatzyscorecategories.ScoreCategory;
import yatzygame.yatzyscorecategories.familyscorecategories.numberfamilyscorecategories.impl.*;
import yatzygame.yatzyscorecategories.familyscorecategories.specialfamilyscorecategories.ChanceScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.specialfamilyscorecategories.YatzyScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.impl.LargeStraightScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.straightfamilyscorecategories.impl.SmallStraightScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.impl.FullHouseScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.impl.TwoPairsScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl.FourOfKindScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl.PairScoreCategoryImpl;
import yatzygame.yatzyscorecategories.familyscorecategories.upletfamilyscorecategories.samekindfamilyscorecategories.impl.ThreeOfKindScoreCategoryImpl;

import java.util.Random;

public enum Category {
    CHANCE(new ChanceScoreCategoryImpl()),
    YATZY(new YatzyScoreCategoryImpl()),
    ONES(new OnesScoreCategoryImpl()),
    TWOS(new TwosScoreCategoryImpl()),
    THREES(new ThreesScoreCategoryImpl()),
    FOURS(new FoursScoreCategoryImpl()),
    FIVES(new FivesScoreCategoryImpl()),
    SIXES(new SixesScoreCategoryImpl()),
    PAIR(new PairScoreCategoryImpl()),
    TWO_PAIRS(new TwoPairsScoreCategoryImpl()),
    THREE_OF_KIND(new ThreeOfKindScoreCategoryImpl()),
    FOUR_OF_KIND(new FourOfKindScoreCategoryImpl()),
    SMALL_STRAIGHT(new SmallStraightScoreCategoryImpl()),
    LARGE_STRAIGHT(new LargeStraightScoreCategoryImpl()),
    FULL_HOUSE(new FullHouseScoreCategoryImpl());

    private static final Random RANDOM = new Random();
    public final ScoreCategory validator;

    Category(ScoreCategory validator){
        this.validator = validator;
    }

    public static Category getRandomCategory() {
        return values()[RANDOM.nextInt(values().length)];
    }
}
