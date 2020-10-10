public class SumOfN {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int sum = 0;
		int start = 0;
		while(start <= range){
			sum+=start;
			start++;
		}
		System.out.println("sum of given n number is : "+sum);
	}
}