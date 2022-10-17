
public class ComputadorDeBordo {
	private double impedanciaPorLitro, impedanciaTanqueCheio, volumeTotalTanque;
	public ComputadorDeBordo(double impedanciaPorLitro, double impedanciaTanqueCheio, double volumeTotalTanque) {
		this.setImpedanciaPorLitro(impedanciaPorLitro);
		this.setImpedanciaTanqueCheio(impedanciaTanqueCheio);
		this.setVolumeTotalTanque(volumeTotalTanque);
	}
	public double calcularMedia(double ohm1, double ohm2, double kmin, double kmfim) {

		//Cheio: 64 ± 4 ohms | Vazio: 363 ± 4 ohms
		// 6,23omhs =1 litro  0,0063 = 1ml
		 
		double cont1,cont2,cont3,cont4,cont5,kmresultado, litros, resultado; 
		
		cont1 = (ohm1-impedanciaTanqueCheio) / impedanciaPorLitro;
		cont2 = volumeTotalTanque-cont1;
		kmresultado = kmfim-kmin;
		
		System.out.printf("Computador de Bordo => Você tinha = %.2f L%n", cont2 );
		System.out.printf("Computador de Bordo =>  Você rodou = %.1f km%n", kmresultado );
		cont3 = (ohm2-impedanciaTanqueCheio) / impedanciaPorLitro;
		cont4 = volumeTotalTanque-cont3;
		System.out.printf("Computador de Bordo =>  Você tem = %.2f L%n", cont4 );
		cont5 = cont2-cont4;
		System.out.printf("Computador de Bordo => Você gastou = %.2f L%n", cont5 );
		
	   	resultado= kmresultado/cont5;
	   	return resultado;

	}
	
	private double quilometragemPercorrida() {
//	Escrever a lógica e retorno
		return 0.0;
	}
	
	private double volumeOcupadoTanque() {
//		Escrever a lógica e retorno
			return 0.0;
		}
	
	private double volumeDisponívelTanque() {
//		Escrever a lógica e retorno
			return 0.0;
		}
	
	public double getImpedanciaPorLitro() {
		return impedanciaPorLitro;
	}
	public void setImpedanciaPorLitro(double impedanciaPorLitro) {
		this.impedanciaPorLitro = impedanciaPorLitro;
	}
	public double getImpedanciaTanqueCheio() {
		return impedanciaTanqueCheio;
	}
	public void setImpedanciaTanqueCheio(double impedanciaTanqueCheio) {
		this.impedanciaTanqueCheio = impedanciaTanqueCheio;
	}
	public double getVolumeTotalTanque() {
		return volumeTotalTanque;
	}
	public void setVolumeTotalTanque(double volumeTotalTanque) {
		this.volumeTotalTanque = volumeTotalTanque;
	}
	

}
