import java.util.Scanner;
public class Main {

	public static Scanner in = new Scanner(System.in);
		// �������� ����� MaxNumber() � ��� ����������� (int) ����������, ����� ����� ��-�������� �� ����� �����. 
	
	
		public static int MaxNumber(int a, int b) {
			if (a > b) {
				return a;
			} else {
				return b;
	}
		}
			//�������� ��������, ����� ������� ��� ���� ����� �� ��������� � ��������� ���-�������� �� ���, ����������� ������ MaxNumber().
			
			public static void main(String[] args) {
			System.out.println("Enter three integer numbers: ");
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = MaxNumber(a, b);
			
			System.out.println("The max numbers is: " + MaxNumber(c, d));

}
}

