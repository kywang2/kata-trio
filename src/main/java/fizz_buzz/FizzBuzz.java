package fizz_buzz;

public class FizzBuzz {
    public String printsFizzOrBuzzOrBoth(int printedNumber) {
        if (printedNumber % 5 == 0 && printedNumber % 3 == 0){
            return "FizzBuzz";
        }
        if (printedNumber % 3 == 0) {
            return "Fizz";
        }
        if (printedNumber % 5 == 0) {
            return "Buzz";
        }
        return "" + printedNumber;
    }
}
