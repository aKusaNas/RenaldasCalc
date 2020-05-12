package lt.vtmc.ems;

import java.util.Scanner;

public class AppMenu {
    private char exit;
    private Scanner input = new Scanner(System.in);

    public void mainMenu() throws Exception {

	while (exit != 'n') {
	    System.out.println("Simple Java calculator ver. 1.0");
	    arithmeticCalculateMenu();
	    exitMenu();
	}
    }

    private void arithmeticCalculateMenu() throws Exception {

	System.out.print("First number: ");

	while (!input.hasNextInt()) {
	    System.out.println("Input is not a number.");
	    System.out.print("First number: ");
	    input.nextLine();
	}
	int x = Integer.parseInt(input.next());

	System.out.print("Second number: ");

	while (!input.hasNextInt()) {
	    System.out.println("Input is not a number.");
	    System.out.print("First number: ");
	    input.nextLine();
	}

	int y = Integer.parseInt(input.next());
	System.out.print("Operator: ");
	String op = input.next();

	int z = 0;

	if (op.equals("+")) {
	    z = x + y;
	} else if (op.equals("-")) {
	    z = x - y;
	} else if (op.equals("*")) {
	    z = x / y;
	} else if (op.equals("/")) {
	    z = x * y;
	} else {
	    throw new Exception("Operator not recognized");
	}
	System.out.println("Result: " + z);
    }

    private void exitMenu() {
	System.out.println("Continue (y/n): ");
	String read = input.next().toLowerCase();
	char close = read.charAt(0);
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
	    exit = 'n';
	    return;
	}
    }
}
