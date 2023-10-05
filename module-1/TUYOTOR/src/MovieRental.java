public class MovieRental {

    String title;
    String format;
    Boolean isPremiumMovie;
    double rentalPrice;

    public MovieRental(String title, String format, Boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;

    }
    @Override

    public String toString() {
        return "Movie " + title + " Format " + format + " Price " + rentalPrice;

    }

    public static double calculateDaysLate(double daysLate) {
        if (daysLate == 0) {
            return 0.00;
        } else if (daysLate == 1 ) {
            return 1.99;
        } else if (daysLate == 2) {
            return 3.99;
        } else {
            return 19.99;
        }

    }
}
