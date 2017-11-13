

import java.util.Scanner;

public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int[] array = new int[10];



		Scanner s = new Scanner(System.in);

		System.out.println("Enter ten numbers");




		for (int i = 0; i < array.length; i++) {

			array[i] = s.nextInt();


		}

		s.close();


		System.out.println("Even numbers of an array are:");




		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.println(array[i]);


			}
		}

	}

}