package yatzygame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yatzygame.models.Category;
import yatzygame.models.Dice;
import yatzygame.models.Roll;
import yatzygame.yatzyscorecategories.ScoreCategory;

public class YatzyGame {

    private static final Logger LOGGER = LoggerFactory.getLogger(YatzyGame.class);

    public static void main (String[] args) {
            Category category = Category.getRandomCategory();

            LOGGER.info("--------------Start the Game-------------");
            Roll dices = Roll.of(Dice.ONE,Dice.FIVE,Dice.TWO,Dice.THREE,Dice.ONE);
            LOGGER.info("dices used for the game : {} ", dices.getDices());
            LOGGER.info("Yatzy Category : {} ", category);
            ScoreCategory scoreCatgory =  category.validator;
            int score =  scoreCatgory.calculateScore(dices);
            LOGGER.info("Votre score est : {}", score);
        }
    }

