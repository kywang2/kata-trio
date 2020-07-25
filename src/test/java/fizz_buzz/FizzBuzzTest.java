package fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void whenGivenNeg1FizzBuzzSaysNeg1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(-1);
        assertThat(spokenWord).isEqualTo("Error");
    }
    @Test
    public void whenGiven1FizzBuzzSays1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void whenGiven2FizzBuzzSays2() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(2);
        assertThat(spokenWord).isEqualTo("2");
    }

    @Test
    public void whenGiven3FizzBuzzSays3() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(3);
        assertThat(spokenWord).isEqualTo("3");
    }

    @Test
    public void whenGiven4FizzBuzzSays4() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(4);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void whenGiven5FizzBuzzSays5() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void whenGiven6FizzBuzzSays8() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(8);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void whenGiven10FizzBuzzSays10() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(10);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void whenGiven15FizzBuzzSays20() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(20);
        assertThat(spokenWord).isEqualTo("FizzBuzz");
    }
    @Test
    public void whenGiven15FizzBuzzSays44() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(44);
        assertThat(spokenWord).isEqualTo("FizzBang");
    }  @Test
    public void whenGiven15FizzBuzzSays55() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.printsFizzOrBuzzOrBoth(55);
        assertThat(spokenWord).isEqualTo("BuzzBang");
    }
}
