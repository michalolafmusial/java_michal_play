import java.util.Scanner;
import static java.lang.Math.*;

public class metody_01_07 {
	public static void main(String[] args) {

	System.out.println(isParzysta(9));
	System.out.println(isPodzielna15(4));
	System.out.println(trzecia_potega(1));
	System.out.println(pierwiastek(1));
	System.out.println(trojkat(1,3,4));
	}
	
	// metoda sprawdza czy liczba a jest parzysta (podzielna przez 2)
	private static boolean isParzysta(float a) {
		System.out.println("Sprawdzenie czy podzielna przez 2. Podaj liczbê:");
		Scanner odczyt = new Scanner(System.in);
		a = odczyt.nextFloat();
		return a % 2 == 0;
	}
	
	private static boolean isPodzielna15(float b) {
		System.out.println("Sprawdzenie czy podzielna przez 15. Podaj liczbê:");
		Scanner odczyt2 = new Scanner(System.in);
		b = odczyt2.nextFloat();
		
		return (b % 3 == 0 && b % 5 == 0);
	}
	
	private static float trzecia_potega(float x) {
		System.out.println("Podaj liczba a ja podam trzeci¹ potêgê: ");
		Scanner odczyt3 = new Scanner(System.in);
		x = odczyt3.nextFloat();
		x = x*x*x;
		return x;
	}
	
	private static double pierwiastek(double y) {
		System.out.println("Podaj liczba a ja podam jej pierwiastek: ");
		Scanner odczyt4 = new Scanner(System.in);
		y = odczyt4.nextDouble();
		y = sqrt(y);
		return y;
	}
	
	private static boolean trojkat (double q, double w, double e) {
		System.out.println("Podaj dlugosc pierwszego boku: ");
		Scanner odczyt5 = new Scanner(System.in);
		q = odczyt5.nextDouble();
		
		System.out.println("Podaj dlugosc drugiego boku: ");
		Scanner odczyt6 = new Scanner(System.in);
		w = odczyt6.nextDouble();
		
		System.out.println("Podaj dlugosc trzeciego boku: ");
		Scanner odczyt7 = new Scanner(System.in);
		e = odczyt7.nextDouble();
		
		
		
		return (q+w>e && q+e>w && w+e>q);
	}
}