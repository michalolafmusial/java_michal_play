import java.util.Scanner;

public class tablica_imiona {
	public static void main(String[] args) {
		String tablica[] = new String[5];
		// petla do wpisania do tablicy
		int k;
		for (int i=0; i<5; i++) 
		{
			k=i+1;
			System.out.println("Podaj imie numer " +k+":");
			String imie;
			Scanner odczyt = new Scanner(System.in);
			imie = odczyt.nextLine();
			tablica [i] = imie;
			System.out.println("Witaj " +imie);
		}
		
		//petla do wyswietlania danych z tablicy
		for (int j=0;j<5;j++)
		{
		System.out.println("Imie numer "+j+" to "+tablica[j]);
		}
	}
	
}