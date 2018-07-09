import java.util.Scanner;

public class bomba {
	public static void main(String[] args) {
	short i;
	int j;
	System.out.println("Podaj czas");
Scanner odczyt = new Scanner(System.in);
i = odczyt.nextShort();

for (j=i; j>0; j--)
{
	System.out.println("Bomba wybuchnia za " +j +" sekundy...");
}			
			
System.out.println("BUM");			

			
	}
}