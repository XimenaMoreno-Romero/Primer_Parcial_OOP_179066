package calculosparafigurasCyC;

public class Cuadrado {
double lado;
	
	public Cuadrado() {
		this(179066/1000);
	}
	public Cuadrado(double valor) {
		this.lado= valor;
	}
	
	public double calculararea() {
		return lado*lado;
	}
	public double calculodiagonal() {
		return Math.sqrt(Math.pow(lado, 2)*2);
		
	}
	public double calculoperimetro() {
		return (4*lado);
		
	}
}
