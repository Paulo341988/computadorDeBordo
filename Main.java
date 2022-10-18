import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
 

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ComputadorDeBordo cb = new ComputadorDeBordo(6.23, 64, 48);
		
		//Cheio: 64 ± 4 ohms | Vazio: 363 ± 4 ohms
		// 6,23omhs =1 litro  0,0063 = 1ml
		
		double ohm1,ohm2,kmin,kmfim;
		
		System.out.printf("Medição em ohms =");
		ohm1 = sc.nextDouble();
		System.out.printf("Km inicial = ");
		kmin = sc.nextDouble();
		System.out.printf("Km Final = ");
		kmfim = sc.nextDouble();
		System.out.printf("Medição em ohms final =");
		ohm2 = sc.nextDouble();
	   	System.out.printf("Computador de Bordo => Seu Consumo foi de = %.2f km/l%n", cb.calcularMedia(ohm1, ohm2, kmin, kmfim));
	
	   		   	
		sc.close();
	}
}