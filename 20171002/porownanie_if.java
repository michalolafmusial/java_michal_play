import java.util.Scanner;

public class porownanie_if{
public static void main (String[] args)	
	
{
int a;
int b;

System.out.println("Podaj pierwsza liczbe: ");
Scanner odczyt_a = new Scanner(System.in);
a = odczyt_a.nextInt();

System.out.println("Podaj druga liczbe: ");
Scanner odczyt_b = new Scanner(System.in);
b = odczyt_b.nextInt();

if (a>b)
{ System.out.println("a > b");
	}
else {
	System.out.println("b > a");
}

}
}