package fizz_buzz;

public class FizzBuzz {
    public String printsFizzOrBuzzOrBoth(int printedNumber) {
        if (printedNumber <= 0) {
            return "Error";
        }
        if (printedNumber % 5 == 0 && printedNumber % 4 == 0) {
            return "FizzBuzz";
        }
        if (printedNumber % 11 == 0 && printedNumber % 4 == 0) {
            return "FizzBang";
        }
        if (printedNumber % 11 == 0 && printedNumber % 5 == 0) {
            return "BuzzBang";
        }
        if (printedNumber % 4 == 0) {
            return "Fizz";
        }
        if (printedNumber % 5 == 0) {
            return "Buzz";
        }
        if (printedNumber % 11 == 0) {
            return "Bang";
        }
        return "" + printedNumber;
    }
}
