import java.util.Scanner;

public class sum_roznica_iloczyn_03 {
	public static void main(String[] args) {
		float a;
		float b;
		float suma;
		float roznica;
		float iloczyn;
		
		System.out.println("Podaj liczbe a: ");
		Scanner odczyt1 = new Scanner(System.in);
		a = odczyt1.nextFloat();
		
		System.out.println("Podaj liczbe b: ");
		Scanner odczyt2 = new Scanner(System.in);
		b = odczyt2.nextFloat();
		
		suma = a+b;
		roznica = a-b;
		iloczyn = a*b;
				
		System.out.println("Suma liczb to: "+suma);
		System.out.println("ROznica liczb to: "+roznica);
		System.out.println("Iloczyn liczb to: "+iloczyn);
	}
	
}