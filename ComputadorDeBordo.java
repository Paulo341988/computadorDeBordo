import java.util.Locale;
import java.util.Scanner;

public class ComputadorDeBordo {
	private String calcularMedia() {
 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Cheio: 64 ± 4 ohms | Vazio: 363 ± 4 ohms
		// 6,23omhs =1 litro  0,0063 = 1ml
		
		double ohm1,ohm2, cont1,cont2,cont3,cont4,cont5, kmin,kmfim,kmresultado, litros, resultado;
		
		System.out.printf("Medição em ohms =");
		
		ohm1 = sc.nextDouble();
		cont1 = (ohm1-64) /6.23;
		cont2 = 48-cont1;
		
		System.out.printf("Você tinha = %.2f L%n", cont2 );
						
		System.out.printf("Km inicial = ");
		kmin = sc.nextDouble();
		System.out.printf("Km Final = ");
		kmfim = sc.nextDouble();
		kmresultado = kmfim-kmin;
		System.out.printf("Você rodou = %.1f km%n", kmresultado );
	    
		System.out.printf("Medição em ohms final =");
		ohm2 = sc.nextDouble();
		cont3 = (ohm2-64) /6.23;
		cont4 = 48-cont3;
		System.out.printf("Você tem = %.2f L%n", cont4 );
		cont5 = cont2-cont4;
		System.out.printf("Você gastou = %.2f L%n", cont5 );
		
			   
	   	resultado= kmresultado/cont5;
	   	return "Seu Consumo foi de = %.2f km/l%n", resultado;
	

		sc.close();
	}
	

}
