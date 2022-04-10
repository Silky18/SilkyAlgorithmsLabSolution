import java.util.Scanner;

public class CurrencyDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		int sizeofArray = sc.nextInt();
		int[] notes = new int[sizeofArray];

		System.out.println("Enter the currency denomination value");
		for (int i = 0; i < sizeofArray; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay in decending order");
		int amount = sc.nextInt();

		int[] counter = new int[notes.length];
		
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					counter[i] = amount / notes[i];
					amount = amount - counter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount can not be given");
			} else {
				System.out.println("Your paymemt approach in order ot give minimum no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (counter[i] != 0) {
						System.out.println(notes[i] + ":" + counter[i]);
					}
				}

			}
		} catch (ArithmeticException e) {
		  System.out.println("throws an exception");
		}
	}
}
