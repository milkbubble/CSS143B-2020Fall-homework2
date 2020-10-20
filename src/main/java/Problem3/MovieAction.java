package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue >= 5) {
            return numOfDaysPastDue * 2 * lateFeePerDayInDollar;
        } else if (numOfDaysPastDue < 1) {
            return 0;
        } else {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
    }
}
