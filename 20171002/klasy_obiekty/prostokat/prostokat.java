import java.util.Scanner;
import static java.lang.Math.*;

class prostokat {
	
	int a; // dlugosc
	int b; // szerokosc
	int p; // pole
	int o; // obwod
	double d; // przekatna
	
	// metoda do pobrania od uzytkownika dlugosci prostokata
	void getDlugosc() {
		System.out.println("Podaj dlugosc prostokata:");
		Scanner odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
	}
	
	// metoda do pobrania od uzytkownika szerokosci prostokata
	void getSzerokosc() {
		System.out.println("Podaj szerokosc prostokata:");
		Scanner odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
	}
	
	// metoda do wydrukowania wymairow prostokata
	void wymiary() {
		System.out.println("Moj prostokat ma wymiary "+a+"x"+b);
	}
	
	// metoda na obliczneie pola
	void pole() {
		p = a*b;	
		System.out.println("Pole prostokata wynosi: "+p);
	}
	
	// metoda na obliczenie obwodu
	void obwod() {
		o = 2*a + 2*b;
		System.out.println("Obwod prostokata wynosi: "+o);
	}
	
	// metoda na obliczenie przekatnej
	void przekatna() {
		d = sqrt(a*a+b*b);
		System.out.println("Przekatna prostokata wynosi: "+d);
	}
}