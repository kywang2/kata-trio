package triangles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrianglesTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5,5,3);
        assertThat(triangleType).isEqualTo("Isosceles");
    }
//    @Test
//    public void inOrderEqualSidesIsAnRightTriangle() {
//        TriangleSorter underTest = new TriangleSorter();
//        String triangleType = underTest.analyze(3, 4, 5));
//        assertThat(triangleType).isEqualTo("Right");
//    }
//    @Test
//    public void twoThreeFourTriangle() {
//        TriangleSorter underTest = new TriangleSorter();
//        String triangleType = underTest.analyze(2, 3, 4));
//        assertThat(triangleType).isEqualTo("Still a Triangle, but not one of the three.");
//    }
//    @Test
//    public void twoThreeFiveTriangle() {
//        TriangleSorter underTest = new TriangleSorter();
//        String triangleType = underTest.analyze(2, 3, 5));
//        assertThat(triangleType).isEqualTo("Cannot be made into a triangle.");
//    }
}
