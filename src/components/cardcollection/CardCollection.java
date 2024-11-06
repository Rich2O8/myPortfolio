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
     * @ensures this = #this the size of this does not change
     */
    int valueBWDates(String date1, String date2);

    /**
     * Changes the original date {@code date1} to the new date of a date, value
     * pair of this.
     *
     * @param date1
     *            the original date of a date, value pair of this.
     * @param date2
     *            the new date of a date, value pair of this.
     * @ensures {@code
     * date1, value -> date2, value
     * this = #this
     * }
     */
    void changeDate(String date1, String date2);

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
