import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class zapis_pliku{
public static void main (String[] args) throws FileNotFoundException {
	
	// podanie i zapisanie zmiennej
	String imie;
	System.out.println("Podaj swoje imie: ");
	Scanner odczyt = new Scanner(System.in);
	imie = odczyt.nextLine();
	System.out.println("Moje imie to " +imie);
	
	// zapis do pliku
	PrintWriter zapis = new PrintWriter("plik.txt");
	zapis.println(imie);
	zapis.close();
	
	// odczyt z pliku
	File file = new File("plik.txt");
	Scanner in = new Scanner(file);
	String zdanie = in.nextLine();System.out.println("Odczyt z pliku" +zdanie);
}	
	
}