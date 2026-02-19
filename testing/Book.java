import java.util.Arrays;

/**
 * Represents a book record with price, ISBN, and ratings.
 */
public class Book {

    private double price;
    private String isbn;
    private int[] ratings;

    private static final String ISBN_REGEX = "\\d{3}-\\d{10}";

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /** Default constructor – creates an empty book. */
    public Book() {
        this.ratings = new int[0];
    }

    /** Constructor with price and ISBN (no ratings). */
    public Book(double price, String isbn) {
        setPrice(price);
        setIsbn(isbn);
        this.ratings = new int[0];
    }

    /** Full constructor with price, ISBN, and ratings. */
    public Book(double price, String isbn, int[] ratings) {
        setPrice(price);
        setIsbn(isbn);
        setRatings(ratings);
    }

    // -------------------------------------------------------------------------
    // Static factory methods
    // -------------------------------------------------------------------------

    /**
     * Factory method that creates a Book pre-populated with ratings.
     *
     * @param price   positive book price
     * @param isbn    ISBN matching \d{3}-\d{10}
     * @param ratings array of rating values
     * @return a new Book instance
     */
    public static Book createWithRatings(double price, String isbn, int[] ratings) {
        return new Book(price, isbn, ratings);
    }

    /**
     * Factory method that creates a Book with no ratings.
     *
     * @param price positive book price
     * @param isbn  ISBN matching \d{3}-\d{10}
     * @return a new Book instance
     */
    public static Book createWithoutRatings(double price, String isbn) {
        return new Book(price, isbn);
    }

    // -------------------------------------------------------------------------
    // Getters and Setters (with validation)
    // -------------------------------------------------------------------------

    public double getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @throws IllegalArgumentException if price is not positive
     */
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive, but was: " + price);
        }
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the ISBN after validating against \d{3}-\d{10}.
     *
     * @throws IllegalArgumentException if isbn does not match the expected pattern
     */
    public void setIsbn(String isbn) {
        if (isbn == null || !isbn.matches(ISBN_REGEX)) {
            throw new IllegalArgumentException(
                    "ISBN must match pattern \\d{3}-\\d{10}, but was: " + isbn);
        }
        this.isbn = isbn;
    }

    public int[] getRatings() {
        return ratings == null ? new int[0] : Arrays.copyOf(ratings, ratings.length);
    }

    /**
     * Sets ratings. A null array is stored as an empty array.
     */
    public void setRatings(int[] ratings) {
        this.ratings = (ratings == null) ? new int[0] : Arrays.copyOf(ratings, ratings.length);
    }

    // -------------------------------------------------------------------------
    // Computed helpers
    // -------------------------------------------------------------------------

    /**
     * Returns the average rating, or 0.0 if there are no ratings.
     */
    public double getAverageRating() {
        if (ratings == null || ratings.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }

    // -------------------------------------------------------------------------
    // toString
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("isbn='").append(isbn).append('\'');
        sb.append(", price=").append(price);
        sb.append(", ratings=").append(Arrays.toString(ratings));
        sb.append(", averageRating=").append(String.format("%.2f", getAverageRating()));
        sb.append('}');
        return sb.toString();
    }
}