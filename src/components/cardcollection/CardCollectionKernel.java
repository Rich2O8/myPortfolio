package components.cardcollection;

import components.standard.Standard;

/**
 * Card Collection component with kernel methods.
 */
public interface CardCollectionKernel extends Standard<CardCollection> {

    /**
     * Reports the size of the map that stores the values of a card.
     *
     * @return the size of the value map of {@code this}
     */
    int mapSize();

    /**
     * Retrives the name of the card in this.
     *
     * @return cardName of {@code this}
     * @ensures {@code <cardName> is the card of this}
     */
    String card();

    /**
     * Adds the pair date {@code date} and value {@code val} to this.
     *
     * @param date
     *            the {@code String} date of the recorded card value.
     * @param val
     *            the {@code int} value of the card at {@code date} date.
     * @updates this
     * @ensures this = #this + 1
     */
    void addCardValue(String date, int val);

    /**
     * Removes the card value entry with the key {@code date} and return the
     * value.
     *
     * @param date
     *            the {@code String} date of the recorded card value.
     * @return the card value at {@code date}
     * @updates this
     * @ensures this = #this - 1
     */
    int removeCardDate(String date);

    /**
     * Reports the value of this at {@code date}.
     *
     * @param date
     *            the {@code String} date of the value of this.
     * @return the value of this at {@code date}
     * @ensure this = #this
     */
    int valAtDate(String date);
}
