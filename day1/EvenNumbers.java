public class EvenNumbers {

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void evensInAscending(int lastNum) {
		for (int num = 1; num <= lastNum ; num++) {
			if(isEven(num)){
				System.out.println(num);
			}
		}
	}
	public static void evensInDescending(int lastNum) {
		for (int num = lastNum; num > 0 ; num--) {
			if(isEven(num)){
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		evensInDescending(num);
		evensInAscending(num);
	}
}