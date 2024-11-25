import org.junit.Test;

import components.cardcollection.CardCollectionMap;;

/**
 * JUnit test fixture for {@code CardCollection}'s standard methods.
 *
 * @author Ricardo Tinoco Lopez
 */
public class CardCollectionStandardTests {
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
}
