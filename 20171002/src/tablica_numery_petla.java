import java.util.Scanner;

public class tablica_numery_petla {
	public static void main(String[] args) {
		System.out.println("Podaj dlugosc tablicy");
		int n;
		int j;
		int i;
		// Zczytanie dlugosci tablicy
		Scanner odczyt = new Scanner(System.in);
		n = odczyt.nextInt();
		// Utworzenie tablicy o dlugosci n
		int tablica[] = new int [n];
		System.out.println("Dlugosc tablicy to "+n);
		//wpisanie kolejnych wartosc 1..n do tablicy
		for (i=0;i<n;i++) {
			j=i;
		tablica [i] = i;	
		}
		//wyswietlenie zawartosci tablicy
		for (j=0;j<n;j++) {
			System.out.println("Wartosc komorki numer " +j +" to "+tablica[j]);	
		}
			
	}
	
}