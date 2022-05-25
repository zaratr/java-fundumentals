package inheritance;

public class Review {
    public Event event;
    public String body;
    public String author;
    public String clientMovie;
    public int stars;

    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String body, String author, int stars, Event SaltGrass){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.event = SaltGrass;
    }
    public Review(String body, String author, int stars, Event SaltGrass, String reviewedMovie){

        this.body = body;
        this.author = author;
        this.stars = stars;
        this.event = SaltGrass;
        this.clientMovie = reviewedMovie;
    }


    @Override
    public String toString() {
        String ptr = "";
        if(event instanceof Theater) ptr = ((Theater)event).findMovieReviewed(clientMovie);
        if(event == null)
            return event.name + " " + event.priceCategory + " reviewed by: " + author + " \n" + body + " \n";
        return event.name + " " + event.priceCategory + " reviewed by: " + author + " \n" + body + " \n" + "movie reviewed: " + ptr;
    }
}
