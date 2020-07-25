package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BabySitterTest {
    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 18, 20);
        assertThat(wage).isEqualTo(12);
    }

    @Test
    public void oneHourAfterMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(24, 1, 20);
        assertThat(wage).isEqualTo(16);
    }

    @Test
    public void oneHourBedTimeShouldPay8() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(20, 21, 20);
        assertThat(wage).isEqualTo(8);
    }

    @Test
    public void oneHourPreBedAndBedtime20() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(20, 22, 21);
        assertThat(wage).isEqualTo(20);
    }

    @Test
    public void oneHourBedTimeAndOneHourPostBedtime24() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(23, 1, 23);
        assertThat(wage).isEqualTo(24);
    }
    @Test
    public void preDuringPostBedTime36() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(22, 1, 23);
        assertThat(wage).isEqualTo(36);
    }
    @Test
    public void returnInvalid() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(23, 17, 20);
        assertThat(wage).isEqualTo(-1);
    }
}
