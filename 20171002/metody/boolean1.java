import java.util.Scanner;

public class boolean1 {
	public static void main(String[] args) {
		boolean isParzysta;
	System.out.println("Podaj liczbe naturalna");
	int b;
	int c;
	Scanner odczyt = new Scanner(System.in);
	b = odczyt.nextInt();
	c = b%2;
	System.out.println("c: "+c);
	if (c==0) {isParzysta = true;}
	else {
		{isParzysta = false;}
	}
	
	System.out.println("isParzysta: "+isParzysta);
	
	if (isParzysta == true) {
		System.out.println("Liczba parzysta "+isParzysta);
	} else if (isParzysta == false) {
		System.out.println("Liczba nieparzysta "+isParzysta);
	}

	
	}
}