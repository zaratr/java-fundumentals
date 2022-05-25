/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void testingZero(){
        Restaurant McDonalds = new Restaurant();
        Shop corner = new Shop();
        Theater movies = new Theater();
        assertTrue(McDonalds.name == "");
        assertTrue(corner.name == "");
        assertTrue(movies.name == "");

        return;
    }
    @Test
    public void testZeroAdd()
    {
        Review aReview = new Review("stuff", "Rman", 2);
        Restaurant sut = new Restaurant();
        Shop sut1 = new Shop();
        Theater sut2 = new Theater();
        sut.addReview(aReview);
        sut1.addReview(aReview);
        sut2.addReview(aReview);
        assert(sut.restReviews.size()== 1);
        assert(sut1.restReviews.size()== 1);
        assert(sut2.restReviews.size()== 1);
    }
    @Test void testingToString(){
        Restaurant PizzaHut = new Restaurant ("$", "Pizza Hut", 1);
        Shop sut1 = new Shop ("$", "7-11", 1);
        Theater sut2 = new Theater ("$", "AMC", 1);
        assertTrue(PizzaHut.toString() != null);
        assertTrue(sut1.toString() != null);
        assertTrue(sut2.toString() != null);
    }
    @Test void testingReview() {
        Restaurant SaltGrass = new Restaurant("$", "Salt Grass", 5);
        Review sut = new Review("hello", "Jason Wilson", 5, SaltGrass);
        String finalWord = sut.toString();
        String checker = "Salt Grass $ reviewed by: Jason Wilson \nhello \n";
        int x = finalWord.compareTo(checker);
            assertEquals(checker, sut.toString());
        return;
    }
    @Test void testingAddReview(){
        Event addReviewVar = new Restaurant("$$$", "Harkins", 5);
        Event sut = new Shop("$$", "7-11", 3);
        Event sut2 = new Theater("$", "Harkins", 4);

        addReviewVar.addReview(new Review("is..pimping", "Raul", 4, addReviewVar));
        sut.addReview(new Review("is..pimping", "Raul", 4, addReviewVar));
        sut2.addReview(new Review("is..pimping", "Raul", 4, addReviewVar));

        assertTrue(addReviewVar.hasReview(new Review("is..pimping", "Raul", 4, addReviewVar)));
        assertTrue(sut.hasReview(new Review("is..pimping", "Raul", 4, sut)));
        assertTrue(sut2.hasReview(new Review("is..pimping", "Raul", 4, sut2)));
        return;
    }
    @Test
    public void testDownCast()
    {
        Event mcDonalds = new Restaurant("$", "McDonald", 5);
        Event cornerStore = new Shop("$$", "7-11", 5);
        assert(mcDonalds instanceof Restaurant);
        assert(cornerStore instanceof Shop);

        return;
    }

    @Test
    public void testTheaterMovieReview()
    {
        Event sut = new Theater("$", "Harkins", 4);
        if(sut instanceof Theater) {
            ((Theater) sut).addMovie("spiderman");
            ((Theater) sut).addMovie("catwomen");
            ((Theater) sut).addMovie("aquaman");
            ((Theater) sut).addMovie("batman");
        }
        Review movieReview = new Review("was good!", "raul",4, sut, "spiderman");
        String finalWord = movieReview.toString();
        String checker = "Harkins $ reviewed by: raul \nwas good! \nmovie reviewed: spiderman" ;
        assertEquals(checker, finalWord);
        return;

    }


}
