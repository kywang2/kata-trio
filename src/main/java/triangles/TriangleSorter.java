package triangles;
//Triangles
//
//        From the Columbus Scala User Group's repo of katas is a simple kata to determine different types of triangles.
//
//        Using TDD, write a method or function that accepts three numbers as the lengths of three line segments. Determine computationally which of the following cases are true:
//
//        The three segments
//
//        Can be joined into an equilateral triangle. (example: 3, 3, 3)
//        Can be joined into an isosceles triangle. (example: 5, 5, 3);
//        Can be joined into a right triangle. (example: 3, 4, 5);
//        Can only be joined into a triangle that is not one of the preceding cases. (example: 2, 3, 4)
//        Cannot be made into a triangle. (example: 2, 3, 5) [Warning: might look isosceles at first glance.]
//        The order in which the segments are supplied must not affect the result.
public class TriangleSorter {

    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC && sideC ==sideA){
            return "Equilateral";
        }
        if (sideA ==sideB ) {
            return "Isosceles";
        }
        if (printedNumber % 5 == 0) {
            return "Right";
        }
        if (printedNumber % 5 == 0) {
            return "Still a Triangle, but not one of the three.";
        }
        if (printedNumber % 5 == 0) {
            return "Cannot be made into a triangle.";
        }
        return "" + printedNumber;
    }
}
