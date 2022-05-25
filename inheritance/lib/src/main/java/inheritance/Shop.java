package inheritance;

import java.util.HashSet;

public class Shop extends Event {
    public Shop() {
        super();
    }

    public Shop (String priceCategory, String name, int restStars) {
        super(priceCategory,
                name,
                restStars);
    }

    @Override
    public String toString() {
        return "Shop: " + name + " has a rating of " + restStars + " and a price category of " + priceCategory;
    }

    @Override
    public void addReview(Review aReview) {
        if(restReviews == null) {restReviews = new HashSet<>();}
        restReviews.add(aReview);

    }

}
