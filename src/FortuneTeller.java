import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// I am not sure how to close it, and I tried java.close () and
		// java.util.Scanner(); but it is still
		// saying resource issue.

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		System.out.println("What is your age?");
		int personAge = input.nextInt();
		input.nextLine();
		System.out.println("What is your birth month in terms of corresponding number, 1 to 12?");
		// This way, the user knows to input a number between 1 and 12.
		int birthMonth = input.nextInt();

		input.nextLine();

		System.out.println("What is your favorite ROYGBIV color? If you don't know type help.");
		String favoriteColor = input.nextLine();
		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("Here's your help: The colors are red, orange, yellow, green, indigo, violet.");
		} else if (favoriteColor.equalsIgnoreCase("red")) {

		} else if (favoriteColor.equalsIgnoreCase("orange")) {

		} else if (favoriteColor.equalsIgnoreCase("yellow")) {

		} else if (favoriteColor.equalsIgnoreCase("green")) {

		} else if (favoriteColor.equalsIgnoreCase("blue")) {

		} else if (favoriteColor.equalsIgnoreCase("indigo")) {

		} else if (favoriteColor.equalsIgnoreCase("violet")) {

		} else {
			System.out.println("You can only put in a color or help command. Have a good day!");
		}
		System.out.println("How many siblings do you have?");
		// This way, the user knows to input a number between 0 and 3.
		int sibTotal = input.nextInt();
		String newVaca = input.nextLine();

		if (sibTotal == 0) {
			newVaca = "Minneapolis";
		} else if (sibTotal == 1) {
			newVaca = "Aruba";
		} else if (sibTotal == 2) {
			newVaca = "Tokyo";
		} else if (sibTotal == 3) {
			newVaca = "Chicago";
		} else if (sibTotal >= 4) {
			newVaca = "Youngstown";
		} else if (sibTotal < 0) {
			newVaca = "Hiroshima";
		} else {
			System.out.println("It looks like someone didn't put a number in and follow directions!");
		}
		System.out.println("What is your retirement age?");
		// This way, the user puts in a whole number.
		int retireAge = input.nextInt();
		input.nextLine();

		if (personAge % 2 == 0) {
			retireAge = (20);
		} else {
			retireAge = (35);
		}
		System.out.println(
				"Your mode of transportation will depend on your favorite color. Please enter your color again!");
		// User has to re-enter color, but will get a cool message.
		String newTranspo = input.next();
		input.nextLine();

		if (favoriteColor.equalsIgnoreCase("red")) {
			newTranspo = "Lamborghini";
			System.out.println("You've got an Italian Stallion. Yeehaw!");

		} else if (favoriteColor.equalsIgnoreCase("orange")) {
			newTranspo = "AMC Pacer from Wayne's World";
			System.out.println("Caught in an escape from reality.");

		} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			newTranspo = "VW Bus";
			System.out.println("Peace, love and a VW.");

		} else if (favoriteColor.equalsIgnoreCase("green")) {
			newTranspo = "You get the Jolly Green Giant";
			System.out.println("He's a fun ride.");

		} else if (favoriteColor.equalsIgnoreCase("blue")) {
			newTranspo = "Police car, a 1974 Dodge Monaco";
			System.out.println("Is this the new Bluesmobile or what?");

		} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			newTranspo = "Blue velvet carpet ride";
			System.out.println("Move over Aladdin and Jasmine.");

		} else if (favoriteColor.equalsIgnoreCase("violet")) {
			newTranspo = "The '87 Buick Grand National";
			System.out.println("Bad to the Bone");

		} else {
			System.out.println("It looks like someone didn't put a color in and follow directions!");
		}

		System.out.println(
				"Your bank balance will depend on your birth month. Please enter your birth month (1-12) again!");
		// To make sure user is putting it between 1-12.
		double bankBalance = input.nextDouble();
		input.nextLine();

		switch (birthMonth) {
		case 1:
			bankBalance = (256000.76);
		case 2:
			bankBalance = (256000.76);
		case 3:
			bankBalance = (256000.76);
		case 4:
			bankBalance = (256000.76);
			break;
		case 5:
			bankBalance = (3687105.42);
		case 6:
			bankBalance = (3687105.42);
		case 7:
			bankBalance = (3687105.42);
		case 8:
			bankBalance = (3687105.42);
			break;
		case 9:
			bankBalance = (86.23);
		case 10:
			bankBalance = (86.23);
		case 11:
			bankBalance = (86.23);
		case 12:
			bankBalance = (86.23);
			break;
		default:
			bankBalance = (0.00);
			System.out.println("Your balance is $0.00 because you didn't enter a number between 1-12.");
			break;
		}
		System.out.println((firstName) + " " + (lastName) + " will retire in " + (retireAge) + " years with $"
				+ (bankBalance) + " in the bank, a vacation home in " + (newVaca) + ", and will travel by "
				+ (newTranspo) + ".");

	}

}
