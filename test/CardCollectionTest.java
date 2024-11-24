import org.junit.Test;

import components.cardcollection.CardCollectionMap;
import components.map.Map;;

/**
 * JUnit test fixture for {@code CardCollection}'s contructor and kernel
 * methods.
 *
 * @author Ricardo Tinoco Lopez
 */
public class CardCollectionTest {
    /**
     * Testing the constructor with an empty string.
     */
    @Test
    public void testConstructor1() {
        String blankString = "";
        CardCollectionMap blankCardExpected = new CardCollectionMap(
                blankString);
        CardCollectionMap blankCard = new CardCollectionMap("");

        org.junit.Assert.assertEquals(blankCardExpected, blankCard);
    }

    /**
     * Testing the constructor with the name pikachu.
     */
    @Test
    public void testConstructor2() {
        String blankString = "Pikachu";
        CardCollectionMap pikachuCardExpected = new CardCollectionMap(
                blankString);
        CardCollectionMap pikachuCard = new CardCollectionMap("Pikachu");

        org.junit.Assert.assertEquals(pikachuCardExpected, pikachuCard);
    }

    /**
     * Testing the constructor with a string length 1.
     */
    @Test
    public void testConstructor3() {
        String blankString = "R";
        CardCollectionMap oneCardExpected = new CardCollectionMap(blankString);
        CardCollectionMap oneCard = new CardCollectionMap("R");

        org.junit.Assert.assertEquals(oneCardExpected, oneCard);
    }

    /**
     * Testing constructor with a lower&upper case + special characters string.
     */
    @Test
    public void testConstructor4() {
        String blankString = "xYz!@ FuSIon!";
        CardCollectionMap blankCardExpected = new CardCollectionMap(
                blankString);
        CardCollectionMap blankCard = new CardCollectionMap("xYz!@ FuSIon!");

        org.junit.Assert.assertEquals(blankCardExpected, blankCard);
    }

    //-------------------Kernel Methods Testing---------------------------------

    /**
     * Testing card() on a card with empty string as it's name.
     */
    @Test
    public void testCard() {
        CardCollectionMap blankCard = new CardCollectionMap("");
        String cardName = blankCard.card(), expectedCardName = "";
        CardCollectionMap expectedCard = new CardCollectionMap(
                expectedCardName);

        org.junit.Assert.assertEquals(expectedCard, blankCard);
        org.junit.Assert.assertEquals(expectedCardName, cardName);
    }

    /**
     * Testing card() on a card with one letter as it's name.
     */
    @Test
    public void testCard1() {
        CardCollectionMap rCard = new CardCollectionMap("R");
        String cardName = rCard.card(), expectedCardName = "R";
        CardCollectionMap expectedRCard = new CardCollectionMap(
                expectedCardName);

        org.junit.Assert.assertEquals(expectedRCard, rCard);
        org.junit.Assert.assertEquals(expectedCardName, cardName);
    }

    /**
     * Testing card() on a card with upper & lower case, special characters,
     * blank space, and numbers.
     */
    @Test
    public void testCard2() {
        String xyzName = "xYz Num@renous!?";
        CardCollectionMap xyzCard = new CardCollectionMap(xyzName);
        String cardName = xyzCard.card(), expectedCardName = "xYz Num@renous!?";
        CardCollectionMap expectedXyzCard = new CardCollectionMap(
                expectedCardName);

        org.junit.Assert.assertEquals(expectedXyzCard, xyzCard);
        org.junit.Assert.assertEquals(expectedCardName, cardName);
    }

    /**
     * Testing add card value on a new card.
     */
    @Test
    public void testAddCardValue() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);
        CardCollectionMap blueExpected = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 0);
        blueExpected.addCardValue("10/01/2021", 0);

        int blSize = blue.mapSize(), blSizeExpected = blueExpected.mapSize();

        org.junit.Assert.assertEquals(blueExpected, blue);
        org.junit.Assert.assertEquals(blSizeExpected, blSize);
    }

    /**
     * Testing add card value twice on the blue eyes card.
     */
    @Test
    public void testAddCardValue1() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);
        CardCollectionMap blueExpected = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 0);
        blueExpected.addCardValue("10/01/2021", 0);
        blue.addCardValue("10/01/2023", 1);
        blueExpected.addCardValue("10/01/2023", 1);

        int blSize = blue.mapSize(), blSizeExpected = blueExpected.mapSize();

        org.junit.Assert.assertEquals(blueExpected, blue);
        org.junit.Assert.assertEquals(blSizeExpected, blSize);
    }

    /**
     * Testing add card value 3 times on the blue eyes card.
     */
    @Test
    public void testAddCardValue2() {
        String blueDraco = "Blue Eyes White Dragon";
        CardCollectionMap blue = new CardCollectionMap(blueDraco);
        CardCollectionMap blueExpected = new CardCollectionMap(blueDraco);

        blue.addCardValue("10/01/2021", 0);
        blueExpected.addCardValue("10/01/2021", 0);
        blue.addCardValue("10/01/2023", 1);
        blueExpected.addCardValue("10/01/2023", 1);
        blue.addCardValue("10/01/2022", 0);
        blueExpected.addCardValue("10/01/2022", 0);

        int blSize = blue.mapSize(), blSizeExpected = blueExpected.mapSize();

        org.junit.Assert.assertEquals(blueExpected, blue);
        org.junit.Assert.assertEquals(blSizeExpected, blSize);
    }

    /**
     * Testing mapSize() on a brand newly created card.
     */
    @Test
    public void testMapSize() {
        String pika = "Pikachu";
        CardCollectionMap pikachu = new CardCollectionMap(pika);
        CardCollectionMap pikachuEx = new CardCollectionMap(pika);

        int pikaMapSize = pikachu.mapSize(), expectedMapSize = 0;
        org.junit.Assert.assertEquals(pikachuEx, pikachu);
        org.junit.Assert.assertEquals(expectedMapSize, pikaMapSize);

    }

    /**
     * Testing mapSize() on a card of map size 1.
     */
    @Test
    public void testMapSize1() {
        String pika = "Pikachu";
        CardCollectionMap pikachu = new CardCollectionMap(pika);
        CardCollectionMap pikachuEx = new CardCollectionMap(pika);

        pikachu.addCardValue("11/19/2024", 1);
        pikachuEx.addCardValue("11/19/2024", 1);

        int pikaMapSize = pikachu.mapSize(), expectedMapSize = 1;
        org.junit.Assert.assertEquals(pikachuEx, pikachu);
        org.junit.Assert.assertEquals(expectedMapSize, pikaMapSize);
    }

    /**
     * Testing mapSize() on a card of map size 2.
     */
    @Test
    public void testMapSize2() {
        String pika = "Pikachu";
        CardCollectionMap pikachu = new CardCollectionMap(pika);
        CardCollectionMap pikachuEx = new CardCollectionMap(pika);

        pikachu.addCardValue("11/19/2024", 1);
        pikachu.addCardValue("10/12/2004", 25);
        pikachuEx.addCardValue("11/19/2024", 1);
        pikachuEx.addCardValue("10/12/2004", 25);

        int pikaMapSize = pikachu.mapSize(), expectedMapSize = 1;
        org.junit.Assert.assertEquals(pikachuEx, pikachu);
        org.junit.Assert.assertEquals(expectedMapSize, pikaMapSize);
    }

    /**
     * Testing removeCardDate on a card with a map size of 1.
     */
    @Test
    public void testRemoveCardDate() {
        String pika = "Pikachu";
        CardCollectionMap pikachu = new CardCollectionMap(pika);

        pikachu.addCardValue("11/19/2024", 1);

        int value = pikachu.removeCardDate("11/19/2024");
        int valueExpected = 1;

        int pikaMapSize = pikachu.mapSize(), expectedMapSize = 0;

        org.junit.Assert.assertEquals(valueExpected, value);
        org.junit.Assert.assertEquals(expectedMapSize, pikaMapSize);
    }

    /**
     * Testing removeCardDate on a card with a map size of 2.
     */
    @Test
    public void testRemoveCardDate1() {
        String pika = "Pikachu";
        CardCollectionMap pikachu = new CardCollectionMap(pika);

        pikachu.addCardValue("11/19/2024", 1);
        pikachu.addCardValue("11/19/2004", 0);

        int value = pikachu.removeCardDate("11/19/2004");
        int valueExpected = 0;

        int pikaMapSize = pikachu.mapSize(), expectedMapSize = 1;

        org.junit.Assert.assertEquals(valueExpected, value);
        org.junit.Assert.assertEquals(expectedMapSize, pikaMapSize);
    }

    /**
     * Testing removeCardDate twice on a card with a map size of 3.
     */
    @Test
    public void testRemoveCardDate2() {
        String pika = "Pikachu";
        CardCollectionMap pikachu = new CardCollectionMap(pika);

        pikachu.addCardValue("11/19/2024", 1);
        pikachu.addCardValue("11/19/2004", 0);
        pikachu.addCardValue("11/17/2004", 2);

        int value = pikachu.removeCardDate("11/19/2004");
        int valueExpected = 0;
        int value2 = pikachu.removeCardDate("11/17/2004");
        int valueExpected2 = 2;

        int pikaMapSize = pikachu.mapSize(), expectedMapSize = 1;

        org.junit.Assert.assertEquals(valueExpected, value);
        org.junit.Assert.assertEquals(valueExpected2, value2);
        org.junit.Assert.assertEquals(expectedMapSize, pikaMapSize);
    }

    /**
     * Testing valAtDate on a card with a map size of 1.
     */
    @Test
    public void testValAtDate() {
        String magi = "Magician";
        CardCollectionMap magician = new CardCollectionMap(magi);

        magician.addCardValue("11/19/2024", 1);

        int value = magician.valAtDate("11/19/2024");
        int valueExpected = 1;

        int magiMapSize = magician.mapSize(), expectedMapSize = 1;

        org.junit.Assert.assertEquals(valueExpected, value);
        org.junit.Assert.assertEquals(expectedMapSize, magiMapSize);
    }

    /**
     * Testing valAtDate on a card with a map size of 2.
     */
    @Test
    public void testValAtDate1() {
        String magi = "Magician";
        CardCollectionMap magician = new CardCollectionMap(magi);

        magician.addCardValue("11/19/2024", 1);
        magician.addCardValue("09/09/2004", 0);

        int value = magician.valAtDate("09/09/2004");
        int valueExpected = 0;

        int magiMapSize = magician.mapSize(), expectedMapSize = 2;

        org.junit.Assert.assertEquals(valueExpected, value);
        org.junit.Assert.assertEquals(expectedMapSize, magiMapSize);
    }

    /**
     * Testing valAtDate twice on a card with a map size of 2.
     */
    @Test
    public void testValAtDate2() {
        String magi = "Magician";
        CardCollectionMap magician = new CardCollectionMap(magi);

        magician.addCardValue("11/19/2024", 1);
        magician.addCardValue("09/09/2004", 0);

        int value = magician.valAtDate("09/09/2004");
        int valueExpected = 0;
        int value2 = magician.valAtDate("11/19/2024");
        int valueExpected2 = 1;

        int magiMapSize = magician.mapSize(), expectedMapSize = 2;

        org.junit.Assert.assertEquals(valueExpected, value);
        org.junit.Assert.assertEquals(valueExpected2, value2);
        org.junit.Assert.assertEquals(expectedMapSize, magiMapSize);
    }

    /**
     * Testing removeAnyDate on a card with a map size of 1.
     */
    @Test
    public void testRemoveAnyDate() {
        String magi = "Magician";
        CardCollectionMap magician = new CardCollectionMap(magi);
        CardCollectionMap magicianExpct = new CardCollectionMap(magi);

        magician.addCardValue("11/19/2024", 1);

        Map.Pair<String, Integer> pair = magician.removeAnyDate();
        String date = pair.key(), expectedDate = "11/19/2024";
        int value = pair.value(), expectedValue = 1;

        int magiMapSize = magician.mapSize(), expectedMapSize = 0;

        org.junit.Assert.assertEquals(expectedValue, value);
        org.junit.Assert.assertEquals(expectedDate, date);
        org.junit.Assert.assertEquals(expectedMapSize, magiMapSize);
        org.junit.Assert.assertEquals(magicianExpct, magician);
    }

    /**
     * Testing removeAnyDate on a card with a map size of 2.
     */
    @Test
    public void testRemoveAnyDate1() {
        String magi = "Magician";
        CardCollectionMap magician = new CardCollectionMap(magi);
        CardCollectionMap magicianExpct = new CardCollectionMap(magi);

        magician.addCardValue("11/19/2024", 1);
        magician.addCardValue("11/25/2024", 2);
        magicianExpct.addCardValue("11/19/2024", 1);
        magicianExpct.addCardValue("11/25/2024", 2);

        Map.Pair<String, Integer> pair = magician.removeAnyDate();
        int removedExpctVal = magicianExpct.removeCardDate(pair.key()),
                removing = pair.value();

        int magiMapSize = magician.mapSize(),
                expectedMapSize = magicianExpct.mapSize();

        org.junit.Assert.assertEquals(expectedMapSize, magiMapSize);
        org.junit.Assert.assertEquals(magicianExpct, magician);
        org.junit.Assert.assertEquals(removedExpctVal, removing);
    }

    //Standard Methods----------------------------------------------------------

    /**
     * Testing clear on a card with an empty map.
     */
    @Test
    public void testClear() {
        String dMagi = "Dark Magician";
        CardCollectionMap darkMagician = new CardCollectionMap(dMagi);

        darkMagician.clear();
        String cardNameClear = darkMagician.card(), expectedName = "";
        int mapSizeAfter = darkMagician.mapSize(), expectedSize = 0;

        org.junit.Assert.assertEquals(expectedName, cardNameClear);
        org.junit.Assert.assertEquals(expectedSize, mapSizeAfter);
    }

    /**
     * Testing clear on a card with map size 1.
     */
    @Test
    public void testClear1() {
        CardCollectionMap darkMagician = new CardCollectionMap("Dark Magician");
        darkMagician.addCardValue("10/21/2024", 2);

        darkMagician.clear();
        String cardNameClear = darkMagician.card(), expectedName = "";
        int mapSizeAfter = darkMagician.mapSize(), expectedSize = 0;

        org.junit.Assert.assertEquals(expectedName, cardNameClear);
        org.junit.Assert.assertEquals(expectedSize, mapSizeAfter);
    }

    /**
     * Testing clear on a card with map size 2.
     */
    @Test
    public void testClear2() {
        CardCollectionMap darkMagician = new CardCollectionMap("Dark Magician");
        darkMagician.addCardValue("10/21/2024", 2);
        darkMagician.addCardValue("10/21/2023", 1);

        darkMagician.clear();
        String cardNameClear = darkMagician.card(), expectedName = "";
        int mapSizeAfter = darkMagician.mapSize(), expectedSize = 0;

        org.junit.Assert.assertEquals(expectedName, cardNameClear);
        org.junit.Assert.assertEquals(expectedSize, mapSizeAfter);
    }

    /**
     * Testing transferFrom on a card with map size 0.
     */
    @Test
    public void testTransferfrom() {
        CardCollectionMap darkMagician = new CardCollectionMap("Dark Magician");
        CardCollectionMap pikachu = new CardCollectionMap("Pikachu");

        darkMagician.addCardValue("11/19/2004", 0);

        darkMagician.transferFrom(pikachu);
        String expectedName = "Pikachu", cardName = darkMagician.card();
        int dMagiZiseAfter = darkMagician.mapSize(), dMagiExpctSize = 1;
        String pikachuAfter = pikachu.card(), pikachuExpctAfter = "";
        int pikachuSizeAfter = pikachu.mapSize(), pikachuExpctSize = 0;

        org.junit.Assert.assertEquals(expectedName, cardName);
        org.junit.Assert.assertEquals(dMagiExpctSize, dMagiZiseAfter);

        org.junit.Assert.assertEquals(pikachuExpctAfter, pikachuAfter);
        org.junit.Assert.assertEquals(pikachuExpctSize, pikachuSizeAfter);
    }

    /**
     * Testing transferFrom on two cards of size 1.
     */
    @Test
    public void testTransferfrom1() {
        CardCollectionMap darkMagician = new CardCollectionMap("Dark Magician");
        CardCollectionMap pikachu = new CardCollectionMap("Pikachu");

        darkMagician.addCardValue("11/19/2004", 0);
        pikachu.addCardValue("12/15/2005", 1);

        darkMagician.transferFrom(pikachu);
        String expectedName = "Pikachu", cardName = darkMagician.card();
        int dMagiZiseAfter = darkMagician.mapSize(), dMagiExpctSize = 2;

        String pikachuAfter = pikachu.card(), pikachuExpctAfter = "";
        int pikachuSizeAfter = pikachu.mapSize(), pikachuExpctSize = 0;

        org.junit.Assert.assertEquals(expectedName, cardName);
        org.junit.Assert.assertEquals(dMagiExpctSize, dMagiZiseAfter);

        org.junit.Assert.assertEquals(pikachuExpctAfter, pikachuAfter);
        org.junit.Assert.assertEquals(pikachuExpctSize, pikachuSizeAfter);
    }

    /**
     * Testing newInstace.
     */
    @Test
    public void testNewInstance() {
        CardCollectionMap ddd = new CardCollectionMap("D/D/D Ceaser");
        CardCollectionMap newCard = ddd.newInstance();

        String newCardName = newCard.card(), newCardExpctName = "D/D/D Ceaser";
        org.junit.Assert.assertEquals(newCardExpctName, newCardName);
    }

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

        blue.addCardValue("10/01/2021", 1);
        blue.addCardValue("10/01/2023", 2);

        blue.changeDate("10/01/2021", "08/05/2021");

        int expectedValueOfChangedDate = 1,
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
                valueOfChangedDate = blue.valAtDate("08/05/2021");
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
}
