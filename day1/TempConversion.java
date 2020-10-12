public class TempConversion {
	public static void main(String[] args) {
		int choice = Integer.parseInt(args[0]);
		float temp = Float.parseFloat(args[1]);
		switch(choice){
			case 1:
				float celsiusTemp = ( temp - 32 ) * (5/9);
				System.out.println(celsiusTemp);
				break;
			case 2:
				float fahrenheitTemp = ( temp * (9/5)) + 32;
				System.out.println(fahrenheitTemp);
				break;
			default:
				System.out.println("Please enter right choice between 1 and 2.");
		}

	}
}