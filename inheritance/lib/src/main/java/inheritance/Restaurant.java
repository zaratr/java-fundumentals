package inheritance;

import java.util.ArrayList;
import java.util.HashSet;

public class Restaurant extends Event{

    public Restaurant() {
        super();
    }

    public Restaurant (String priceCategory, String name, int restStars) {
        super(priceCategory,
                name,
                restStars);
    }

    @Override
    public String toString() {
//        String reviewDescription = "number of reviews" + restReviews.size();
        return "Restaurant: " + name + " has a rating of " + restStars + " and a price category of " + priceCategory;
    }

    public void addReview(Review aReview) {
        if(restReviews == null) {restReviews = new HashSet<>();}
        restReviews.add(aReview);
    }


}
