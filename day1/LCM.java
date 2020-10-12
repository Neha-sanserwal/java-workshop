public class LCM {
	public static int getHCF(int num1,int num2) {
		return HCF.getHCF(num1, num2);
	}
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num2* num1/ getHCF(num1, num2));
	}
}