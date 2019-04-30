package algorithms;

public class Fibonocci {
public static void main(String[] args) {
	
	int i1 = 0;
	int i2 = 1;
	String number;

	for(
	int i = 0;i<12;i++)
	{
i1 += i2;
System.out.println(i2);
i2 += i1;
System.out.println(i1);
	}

}
}
