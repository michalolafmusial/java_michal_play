import java.util.Scanner;
import static java.lang.Math.*;

public class trojmian_kwadratowy {
	public static void main(String[] args) {
		
		String w1 = null;
		String w2 = null;
		String w3 = null;
		double  d;
		double  x0;
		double  x1;
		double  x2;
		
		System.out.println("");
	System.out.println("Poczatek programu...");
	System.out.println("");
	
	System.out.println("Podaj wspó³czynnik a");
	int a;
	Scanner odczyt = new Scanner(System.in);
	a = odczyt.nextInt();
	
	System.out.println("Podaj wspó³czynnik b");
	int b;
	Scanner odczyt2 = new Scanner(System.in);
	b = odczyt2.nextInt();
	
	System.out.println("Podaj wspó³czynnik c");
	int c;
	Scanner odczyt3 = new Scanner(System.in);
	c = odczyt3.nextInt();
	
	if (a==0) { w1 = "";}
	else {w1 = (""+a+"x^2");}

	if (b>0 && a != 0) {w2 = ("+"+b+"x");}
	else {w2 = (""+b+"x");}
	if (b==0){w2 = "";}
	

	if (c>0 && (b!=0 || a!=0) ) {w3 = ("+"+c);}
	else  {w3 = (""+c);}
	if (c==0) { w3 = "";}
	
	if (a==0 && b==0 && c==0) {
		w1="0";
		w2="";
		w3="";
		
	}
	
	// obliczenie delta
	d = b*b-4*a*c;
	
	
	
	System.out.println("");
	System.out.println("Równanie kwadratowe to: y="+w1+w2+w3);
	System.out.println("");
	System.out.println("Delta to: "+d);
	
	if (d<0) {System.out.println("Brak rozwi¹zañ rzeczywistych");}
	if (d==0) {
		System.out.println("Jedno rozwi¹zanie rzeczywiste");
		x0=(-b/(2*a));
		System.out.println("x0= "+x0);
	}
	if (d>0) {
			System.out.println("Dwa rozwi¹zania rzeczywiste");
			x1=((-b-sqrt(d)) / (2*a));
			x2=((-b+sqrt(d)) / (2*a));
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
			}
	
	
	}
}