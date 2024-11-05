import java.util.ArrayList;

public class Book extends Media {

    private int stock;
    private ArrayList<Review> review;


    Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.review = new ArrayList<>();
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void addReview(Review r) {
        review.add(r);
    }

    /////////////////////////////
    public double getAverageRating() {
////• getAverageRating(): Calculates and returns the average rating.
        if (review.size() == 0)
            return 0.0;
        double sum = 0;
        for (Review r : review) {
            sum = sum + r.getRating();
        }
        return sum / review.size();

    }

    public void purchased(User u) {
        if (stock > 0) {
            u.addtopurchased(this);
            stock--;
        } else {
            System.out.println("THE BOOK IS NOT HERE");
        }
    }


    public void isBestseller() {
        if (this.getAverageRating() >= 4.5) {
            System.out.println(" this is the best seller here");
        } else System.out.println(" no this not the best one");
    }

    public void restock(int quantity) {
        stock = stock + quantity;
        System.out.println("Restocked " + quantity + " of " + getTitle());

    }

    @Override
    public String getMediaType() {
        if (this.getAverageRating() >= 4.5) {
            return " Bestselling Book";
        }
        return "Book";
    }


    @Override
    public String toString() {
        return super.toString() + ", Quantity in Stock: " + stock + ", Average Rating: " + getAverageRating();
    }

}










