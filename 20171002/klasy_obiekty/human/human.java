import java.util.Scanner;


class human {
	
	float wiek;
	float waga;
	String wzrost;
	String imie;
	String plec;

	getWiek(35);
	
	void getWiek() {
		System.out.println("Podaj wiek");
		Scanner odczyt = new Scanner(System.in);
		wiek = odczyt.nextFloat();
	}
	
	void getWaga() {
		System.out.println("Podaj wage");
		Scanner odczyt2 = new Scanner(System.in);
		waga = odczyt2.nextFloat();
	}
	
	void getWzrost() {
		System.out.println("Podaj wzrost");
		Scanner odczyt3 = new Scanner(System.in);
		wzrost = odczyt3.nextLine();
	}
	
	void getImie() {
		System.out.println("Podaj imei");
		Scanner odczyt4 = new Scanner(System.in);
		imie = odczyt4.nextLine();
	}
	
	void getPlec() {
		System.out.println("Podaj plec");
		Scanner odczyt5 = new Scanner(System.in);
		plec = odczyt5.nextLine();
	}
	
}