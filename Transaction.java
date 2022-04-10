package datastructure;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;

		System.out.println("Enter the size of transaction array");
		int sizeofArray = sc.nextInt();
		int[] array = new int[sizeofArray];

		System.out.println("Enter the values of array");
		for (i = 0; i < sizeofArray; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			int flag = 0;
			long sum = 0;
			System.out.println("Enter the value of target");
			long targetvalue = sc.nextInt();

			for (i = 0; i < sizeofArray; i++) {
				sum = sum + array[i];

				if (sum >= targetvalue) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}

	}

}
