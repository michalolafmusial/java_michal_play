import java.util.Scanner;

public class pobieranie_danych_2{
public static void main (String[] args)

{
	
	double a;
	double b;
	
System.out.println("Podaj liczbe a");
Scanner odczyt_a = new Scanner(System.in);
a = odczyt_a.nextDouble();

System.out.println("Podaj liczbe b");
Scanner odczyt_b = new Scanner(System.in);
b = odczyt_b.nextDouble();

double c = a+b;
double d = a-b;
double e = a*b;
double f = a/b;

System.out.println("a+b= "+c);
System.out.println("a-b= "+d);
System.out.println("a*b= "+e);
System.out.println("a/b= "+f);


//System.out.println("a+b= "+a+b);
//System.out.println("a-b= "+a-b);
//System.out.println("a*b= "+a*b);



}
}