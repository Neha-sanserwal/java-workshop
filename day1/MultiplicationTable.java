public class MultiplicationTable {

	public static void printLine(int num , int times) {
		int product = num * times;
		System.out.println(num + " X " + times + " = " + product);
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int start = Integer.parseInt(args[1]);
		int end = Integer.parseInt(args[2]);
		for(int times = start; times <= end; times++){
			MultiplicationTable.printLine(num, times);
		}
	}
}