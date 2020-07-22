package triangles;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        TriangleSorter triangleSorter = new TriangleSorter();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter side A:");
        int sideA = keyboard.nextInt();
        System.out.println("Enter side B:");
        int sideB = keyboard.nextInt();
        System.out.println("Enter side C:");
        int sideC = keyboard.nextInt();
        System.out.println(triangleSorter.analyze(sideA, sideB, sideC));

    }
}
