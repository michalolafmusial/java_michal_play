import java.util.Scanner;

public class porownanie_if_char_porownanie {
public static void main (String[] args)	
{

String imie;	
	
System.out.println("Podaj swoje imie: ");
Scanner odczyt_imie = new Scanner(System.in);
imie = odczyt_imie.nextLine();

if (imie.equals("Michal")) {
	System.out.println("Witaj "+imie);
	
}
else {
	
	System.out.println("Nie znam Cie");
}
}
	
}