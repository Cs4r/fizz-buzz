package cs4r.katas.fizzbuzz;

import org.junit.Test;

import static cs4r.katas.fizzbuzz.FizzBuzz.getResult;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDivisibleBy3() {
        assertEquals("Fizz", getResult(3));
        assertEquals("Fizz", getResult(6));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDivisibleBy5() {
        assertEquals("Buzz", getResult(5));
        assertEquals("Buzz", getResult(10));
    }

    @Test
    public void getResultShouldReturnFizzBuzzIfTheNumberIsDivisibleBy3And5() {
        assertEquals("FizzBuzz", getResult(3 * 5));
        assertEquals("FizzBuzz", getResult(3 * 5 * 2));
    }

    @Test
    public void getResultShouldReturnTheNumberIfTheNumberIsNotDivisibleBy3Nor5() {
        assertEquals("7", getResult(7));
        assertEquals("17", getResult(17));
    }
}
