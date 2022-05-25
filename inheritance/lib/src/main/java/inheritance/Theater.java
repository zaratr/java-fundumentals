package inheritance;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Theater extends Event{
    public ArrayList<String> availableMovies;
    public Theater(){super();}
    public Theater (String priceCategory, String name, int restStars){
            super(priceCategory, name, restStars);
    }

    public Theater (String priceCategory, String name, int restStars, Review review) {
        super(priceCategory, name, restStars);
        addReview(review);
    }


        @Override
    public String toString() {
        return "Theater: " + name + " has a rating of " + restStars + " and a price category of " + priceCategory;
    }

    @Override
    public void addReview(Review aReview) {
        if(restReviews == null) {restReviews = new HashSet<>();}
        restReviews.add(aReview);
    }
    public void addMovie(String movieName)
    {
        if(availableMovies == null)
        {
            availableMovies = new ArrayList<>();
        }
        availableMovies.add(movieName);

    }
    public void deleteMovie(String movieName)
    {
        if(availableMovies.isEmpty()){return ;}
        if (availableMovies.contains(movieName)) {
            availableMovies.remove(movieName);
        }

    }

    public String findMovieReviewed(String movieName) {
        String theMovieSeen = "";
        if (availableMovies.contains(movieName)) {
            int num = availableMovies.indexOf(movieName);
            theMovieSeen = availableMovies.get(num);
        }
        return theMovieSeen;
    }

}
