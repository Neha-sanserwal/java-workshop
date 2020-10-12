public class Fibonacci {
	public static void main(String[] args) {
		int firstNo = -1;
		int secondNo = 1;
	for (int step = 0; step < Integer.parseInt(args[0]); step++) {
		int sum = firstNo + secondNo;
		System.out.println(sum);
		firstNo = secondNo;
		secondNo = sum;
	}
}}