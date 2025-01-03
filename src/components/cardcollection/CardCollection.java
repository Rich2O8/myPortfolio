package components.cardcollection;

/**
 * {@code CardCollectionKernel} enhanced with secondary methods.
 */
public interface CardCollection extends CardCollectionKernel {

    /**
     * Reports the difference in card value between {@code date1} and
     * {@code date2}.
     *
     * @param date1
     *            the first date to get card value from
     * @param date2
     *            the second date to get card value from
     * @return the difference in value for this.
     * @requires date1 is older than date2.
     * @ensures this = #this the size of this does not change
     */
    int valueBWDates(String date1, String date2);

    /**
     * Changes the original date {@code ogDate} to the new date of a date, value
     * pair of this.
     *
     * @param ogDate
     *            the original date of a date, value pair of this.
     * @param date2
     *            the new date of a date, value pair of this.
     * @ensures {@code
     * ogDate, value -> date2, value
     * this = #this
     * }
     */
    void changeDate(String ogDate, String date2);

    /**
     * Reports if the card value at {@code date1} is bigger than {@code date2}.
     *
     * @param date1
     *            the first date to get card value from
     * @param date2
     *            the second date to get card value from
     * @return whether value at date 1 is bigger than at date 2.
     * @ensures this = #this the size of this does not change
     */
    boolean valBigger(String date1, String date2);
}
