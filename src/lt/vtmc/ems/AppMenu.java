package lt.vtmc.ems;

import java.util.Scanner;

public class AppMenu {
    private char exit;
    private Scanner input = new Scanner(System.in);


    public void mainMenu() {

	while (exit != 'n') {
	    System.out.println("Simple Java calculator ver. 2.0");
	    arithmeticCalculateMenu();
	    exitMenu();
	}

    }

    private void arithmeticCalculateMenu() {

	System.out.print("First number: ");

	while (!input.hasNextInt()) {
	    System.out.println("Input is not a number.");
	    System.out.println("First number: ");
	    input.nextLine();
	}
	int first = Integer.parseInt(input.next());

	System.out.print("Second number: ");

	while (!input.hasNextInt()) {
	    System.out.println("Input is not a number.");
	    System.out.println("Second number: ");
	    input.nextLine();
	}

	int second = Integer.parseInt(input.next());

	System.out.print("Operator: ");

	int result = 0;

	char operator = input.next().charAt(0);

	switch (operator) {
	case '+':
	    result = first + second;
	    break;

	case '-':
	    result = first - second;
	    break;

	case '*':
	    result = first * second;
	    break;

	case '/':
	    result = first / second;
	    break;

	default:
	    System.out.println("Operator not recognized");
	    break;
	}

	System.out.println("Result:" + result);
    }

    private void exitMenu() {


	System.out.println("Continue (y/n): ");

	char close = input.next().toLowerCase().charAt(0);
	switch (close) {
	case 'y':
	    exit = 'y';
	    return;
	case 'n':
	    exit = 'n';
	    System.out.println("Good luck!");
	    break;
	default:
	    System.out.println("Wrong symbol!");
	    exitMenu();
	}

    }
}
