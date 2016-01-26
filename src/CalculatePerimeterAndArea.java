import java.util.Scanner;

/**
 * 
 */

/**
 * @author Harley Quinn 
 * Purpose: This application asks a user to input the length, width, and height of a rectangular room in meters and returns
 *         the area, perimeter, and volume of the room.
 */
public class CalculatePerimeterAndArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String choice = "y";
		Scanner scanner = new Scanner(System.in);

		while (choice.equalsIgnoreCase("y")) {

			double length1, width1, height1 = 0;

			System.out.println("Enter Length (meters): ");

			length1 = scanner.nextDouble();

			System.out.println("Enter Width (meters): ");

			width1 = scanner.nextDouble();

			System.out.println("Enter Height (meters): ");

			height1 = scanner.nextDouble();

			double area = length1 * width1;
			double perimeter = length1 + length1 + width1 + width1;
			double volume = length1 * width1 * height1;

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

			// ask user for input to see if they would like to continue
			System.out.print("Continue? (y/n): ");
			choice = scanner.next();
			System.out.println();

		}

		choice = scanner.nextLine();
		System.out.println("See you later!");

		scanner.close();

	}

}
