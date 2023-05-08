package implicit;

import java.util.Scanner;

public class implicit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Int = sc.nextInt();
		double Double = Int;
		System.out.println("Implicit casting: " + Double);
		double Double2 = sc.nextDouble();
		int Int2 = (int) Double2;
		System.out.println("Explicit casting: " + Int2);

	}
}
