public class Season{
	public static void main(String[] args){
		int month =  Integer.parseInt(args[0]);
		switch (month) {
			case 1:
			case 11:
			case 12:
				System.out.println("Winter");
				break;
			case 3:
			case 4:
			case 2:
				System.out.println("Spring");
				break;
			case 5:
			case 6:
				System.out.println("Summer");
				break;
			case 7:
			case 8:
				System.out.println("Rainy");
				break;
			default:
				System.out.println("Not Found");
				break;
		}
	}
}
