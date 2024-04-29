import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
    	// Get coordinates from the user
    	double[] point1 = getCoordinates("Enter coordinates for Point 1 (x1 y1): ");
    	double[] point2 = getCoordinates("Enter coordinates for Point 2 (x2 y2): ");

    	// Calculate the distance
    	double distance = calculateDistance(point1[0], point1[1], point2[0], point2[1]);

    	// Print the result
    	System.out.printf("The distance between the two points is: %.2f\n", distance);
	}

	private static double[] getCoordinates(String prompt) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println(prompt);
    	double x = scanner.nextDouble();
    	double y = scanner.nextDouble();
    	return new double[]{x, y};

    	// Note: Scanner should be closed only once in the application, ideally in the main method or after all input operations.
	}

	private static double calculateDistance(double x1, double y1, double x2, double y2) {
    	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
