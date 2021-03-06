/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void someMethodNamedRoll() {

    }

    @Test void someMethodNameContainsDuplicate() {

    }

    @Test void someMethodNamedCalcAvgOfArray() {

    }

    @Test void someMethodNamedLowestAvgArrayImproved() {

    }
    @Test void analyzeWeatherDataTest(){
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(sut.analyzeWeatherData(weeklyMonthTemperatures), """
                High: 72
                Low: 51
                Never saw temperature: 63
                Never saw temperature: 67
                Never saw temperature: 68
                Never saw temperature: 69
                """);
    }

    @Test void tallyTest(){
        Library sut = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = sut.tally(votes);
        assertEquals(winner, "Bush");
        System.out.println(winner + " received the most votes!");
    }
}