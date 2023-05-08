package implicit;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 2;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
