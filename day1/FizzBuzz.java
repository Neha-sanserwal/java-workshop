public class FizzBuzz{
	public static void main(String[] args){
		int limit = Integer.parseInt(args[0]);
		for(int num = 1; num < limit; num++){
			if(num%3 == 0 && num%5 == 0){
				System.out.println("FizzBuzz");
			}else if(num%5 == 0){
				System.out.println("Buzz");
			}else if(num%3 == 0){
				System.out.println("Fizz");
			}else{
				System.out.println(num);
			}
		}
	}
}
