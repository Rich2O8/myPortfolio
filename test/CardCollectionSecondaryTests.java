import org.junit.Test;

import components.cardcollection.CardCollectionMap;;

/**
 * JUnit test fixture for {@code CardCollection}'s secondary methods.
 *
 * @author Ricardo Tinoco Lopez
 */
public class CardCollectionSecondaryTests {
    //Testing Secondary Methods------------------------------------------------

    /**
     * Testing valueBWDates on a card with two recorded values.
     */
    @Test
    public void testValueBWDates() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 1);
        blue.addCardValue("10/01/2023", 2);

        int blSize = blue.mapSize(), blSizeExpected = 2;
        int between21And23 = blue.valueBWDates("10/01/2021", "10/01/2023");
        int expectedValueBetween = 1;

        org.junit.Assert.assertEquals(blSizeExpected, blSize);
        org.junit.Assert.assertEquals(expectedValueBetween, between21And23);
    }

    /**
     * Testing valueBWDates on a card with date1 value > date2 value.
     */
    @Test
    public void testValueBWDates1() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 50);
        blue.addCardValue("10/01/2023", 2);

        int blSize = blue.mapSize(), blSizeExpected = 2;
        int between21And23 = blue.valueBWDates("10/01/2021", "10/01/2023");
        int expectedValueBetween = -48;

        org.junit.Assert.assertEquals(blSizeExpected, blSize);
        org.junit.Assert.assertEquals(expectedValueBetween, between21And23);
    }

    /**
     * Testing changeDate on a date, value pair of a card.
     */
    @Test
    public void testChangeDate() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 10);
        blue.addCardValue("10/01/2023", 2);

        blue.changeDate("10/01/2021", "08/05/2021");

        int expectedValueOfChangedDate = 10,
                valueOfChangedDate = blue.valAtDate("08/05/2021");
        int blSize = blue.mapSize(), blSizeExpected = 2;

        org.junit.Assert.assertEquals(blSizeExpected, blSize);
        org.junit.Assert.assertEquals(expectedValueOfChangedDate,
                valueOfChangedDate);
    }

    /**
     * Testing changeDate on a date, value pair of a card.
     */
    @Test
    public void testChangeDate1() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 1);
        blue.addCardValue("10/01/2023", 25);

        blue.changeDate("10/01/2023", "10/01/2022");

        int expectedValueOfChangedDate = 25,
                valueOfChangedDate = blue.valAtDate("10/01/2022");
        int blSize = blue.mapSize(), blSizeExpected = 2;

        org.junit.Assert.assertEquals(blSizeExpected, blSize);
        org.junit.Assert.assertEquals(expectedValueOfChangedDate,
                valueOfChangedDate);
    }

    /**
     * Testing valBigger on card with 2 records, 1st date is smaller than 2nd,
     * should result in false.
     */
    @Test
    public void testValBigger() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        String twenty1 = "10/01/2021", twenty3 = "10/01/2023";
        blue.addCardValue(twenty1, 1);
        blue.addCardValue(twenty3, 2);

        boolean twentyOneBigger23 = blue.valBigger(twenty1, twenty3);
        boolean twentyOneNuhUh = false;

        org.junit.Assert.assertEquals(twentyOneNuhUh, twentyOneBigger23);
    }

    /**
     * Testing valBigger on card with 2 records,they have the same value. Should
     * result in false.
     */
    @Test
    public void testValBigger1() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        String twenty1 = "10/01/2021", twenty3 = "10/01/2023";
        blue.addCardValue(twenty1, 1);
        blue.addCardValue(twenty3, 1);

        boolean twentyOneBigger23 = blue.valBigger(twenty1, twenty3);
        boolean twentyOneNuhUh = false;

        org.junit.Assert.assertEquals(twentyOneNuhUh, twentyOneBigger23);
    }

    /**
     * Testing valBigger on card with 2 records,1st date > 2nd date value.
     * Should result in true.
     */
    @Test
    public void testValBigger2() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);

        String twenty1 = "10/01/2021", twenty3 = "10/01/2023";
        blue.addCardValue(twenty1, 2);
        blue.addCardValue(twenty3, 0);

        boolean twentyOneBigger23 = blue.valBigger(twenty1, twenty3);
        boolean twentyOneYes = true;

        org.junit.Assert.assertEquals(twentyOneYes, twentyOneBigger23);
    }

    /**
     * Testing equals on 2 cards that differ in the name of the card.
     */
    @Test
    public void testEquals() {
        CardCollectionMap pikaCard = new CardCollectionMap("Pikachu");
        CardCollectionMap pikaEvolved = new CardCollectionMap("Pikachu Hyped");

        boolean notTrue = pikaCard.equals(pikaEvolved);
        boolean expectedEqls = false;

        org.junit.Assert.assertEquals(expectedEqls, notTrue);
    }

    /**
     * Testing equals on 2 cards that differ in the date,value map.
     */
    @Test
    public void testEquals1() {
        CardCollectionMap pikaCard = new CardCollectionMap("Pikachu");
        CardCollectionMap pikaCard2 = new CardCollectionMap("Pikachu");

        pikaCard.addCardValue("11/24/2024", 1);
        pikaCard.addCardValue("11/24/2020", 0);
        pikaCard.addCardValue("11/24/2023", 2);

        boolean notTrue = pikaCard.equals(pikaCard2);
        boolean expectedEqls = false;

        org.junit.Assert.assertEquals(expectedEqls, notTrue);
    }

    /**
     * Testing hashcode on an empty card.
     */
    @Test
    public void testHashCode() {
        String pika = "Pikachu";
        CardCollectionMap pikaCard = new CardCollectionMap(pika);

        int pikaHash = pikaCard.hashCode(), expectedHash = pika.hashCode();

        org.junit.Assert.assertEquals(expectedHash, pikaHash);
    }

    /**
     * Testing hashcode on a card with map size 1.
     */
    @Test
    public void testHashCode1() {
        String pika = "Pikachu";
        CardCollectionMap pikaCard = new CardCollectionMap(pika);
        pikaCard.addCardValue("08/04/2021", 2);

        int pikaHash = pikaCard.hashCode(), expectedHash = pika.hashCode();

        org.junit.Assert.assertEquals(expectedHash, pikaHash);
    }
}
