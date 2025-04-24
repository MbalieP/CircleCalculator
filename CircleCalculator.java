import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double sphereVolume;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference of this circle is: %.2f cm%n", circumference);
        System.out.printf("The area of this circle is: %.2f cm²%n", area);
        System.out.printf("The volume of this sphere is: %.2f cm³%n", sphereVolume);

        scanner.close();
    }
}
