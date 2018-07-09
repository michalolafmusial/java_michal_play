import java.util.Scanner;

public class liczby {
	public static void main(String[] args) {
		System.out.println("");
	System.out.println("Poczatek programu...");
	System.out.println("");
	System.out.println("Podaj liczbe a");
	int a;
	Scanner odczyt = new Scanner(System.in);
	a = odczyt.nextInt();
	System.out.println("Podaj liczbe a");
	int b;
	Scanner odczyt2 = new Scanner(System.in);
	b = odczyt2.nextInt();
	System.out.println("");
	System.out.println("Oblicznia:");
	System.out.println("a+b= "+(a+b));
	System.out.println("a-b= "+(a-b));
	System.out.println("a*b= "+a*b);
	
	}
}