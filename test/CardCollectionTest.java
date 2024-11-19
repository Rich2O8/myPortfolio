import org.junit.Test;

import components.cardcollection.CardCollectionMap;;

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
}
