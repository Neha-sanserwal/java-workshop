public class HCF {
	public static int getHCF(int num1, int num2) {
		while(num2 > 0 && num1 % num2 > 0 ){
			int remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}
		return num2;
	}
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(getHCF(num1, num2));
	}
}