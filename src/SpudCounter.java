
public class SpudCounter {
public static void main(String[] args) {
	
	String pot = "potato";
	int number = 1;
	
	for(int i=1; i<100; i++) {
		
		if (i % 7 == 0) {
			System.out.println(number + " " + pot + ", more ");
			number ++;
		}else {
			System.out.println(number + " " + pot + ", ");
			number ++;
		}
	}
}
}
