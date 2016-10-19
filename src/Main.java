import java.util.Scanner;
public class Main {

	public static Scanner in = new Scanner(System.in);
		// Създайте метод MaxNumber() с два целочислени (int) параметъра, който връща по-голямото от двете числа. 
	
	
		public static int MaxNumber(int a, int b) {
			if (a > b) {
				return a;
			} else {
				return b;
	}
		}
			//Напишете програма, която прочита три цели числа от конзолата и отпечатва най-голямото от тях, използвайки метода MaxNumber().
			
			public static void main(String[] args) {
			System.out.println("Enter three integer numbers: ");
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = MaxNumber(a, b);
			
			System.out.println("The max numbers is: " + MaxNumber(c, d));

}
}

