
public class ForLoopGauntlet {
	public static void main(String[] args) {
		int i2 = 2;
		int i3 = 3;

		int e1 = 1;
		String number = "";
		int add = 0;

		String star = " *";
		int number1 = 0;
		int number2 = 100;
		int number3 = 0;
		int number4 = 1;
		int number5 = 1;
/*
		// Single for loop 1
		for (int i = 0; i < 101; i++) {
			System.out.println(number1);
			number1++;
		}
		// single for loop 2
		for (int i = 0; i < 101; i++) {
			System.out.println(number2);
			number2--;
		}
		// single for loop 3
		for (int i = 0; i < 51; i++) {
			System.out.println(number3);
			number3 += 2;
		}
		// single for loop 4
		for (int i = 0; i < 50; i++) {
			System.out.println(number4);
			number4 += 2;
		}
		// single for loop 5
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd");
			} else if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " " + j);
			}
		}

		for (int i = 1; i < 10; i++) {

			System.out.println(i + " " + i2 + " " + i3);
			i2 += 3;
			i3 += 3;
			i += 2;
		}
*/
		for(int e=1; e<11; e++) {
			for (int i = 0; i < 10; i++) {
				
				
				number += e1 + " ";
				e1 += 1;
				
			}
			System.out.println(number);
			number = "";
		}
/*
		for (int i = 1; i < 10; i++) {

			System.out.println(star);
			star += " *";

		}*/

	}
}
