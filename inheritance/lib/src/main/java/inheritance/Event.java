package inheritance;

import java.util.HashSet;

public abstract class Event {

    public int restStars;
    public String name;
    public String priceCategory;
    public HashSet<Review> restReviews;

    public Event() {
        this.priceCategory = "";
        this.name = "";
        this.restStars = 0;
        this.restReviews = new HashSet<Review>();
    }

    public Event(String priceCategory, String name, int restStars) {
        this.priceCategory = priceCategory;
                this.name = name;
                this.restStars = restStars;
    }
    @Override
    public abstract String toString();
    public abstract void addReview(Review aReview);
    public boolean hasReview(Review aReview)
    {
        boolean success  = false;
        if(restReviews.size() == 0) return false;
        for(Review review : restReviews)
        {
            if(review.author == aReview.author &&
                    review.stars == aReview.stars
                    && review.body == aReview.body)
            {
                success = true;
                break;
            }
        }
        return success;
    }
    public boolean hasReview(String author)
    {
        boolean success = false;
        for(Review review : restReviews)
        {
            if(review.author == author)
            {
                success = true;
                break;
            }
        }
        return success;
    }

}
