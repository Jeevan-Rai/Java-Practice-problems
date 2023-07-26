package catchup;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		// sorting an array

		int temp;

		for (int i = 0; i < size - 1; i++) {

			for (int j = i + 1; i < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		// identify the duplicate

		boolean duplicate = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; i < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;

				}
			}

		}

		if (duplicate) {
			System.out.println("duplicate is present");

		} else {
			System.out.println("duplicate is not present");
		}

		// print the array

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
	}

}