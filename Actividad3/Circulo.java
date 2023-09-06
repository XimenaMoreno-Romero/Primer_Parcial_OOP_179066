package calculosparafigurasCyC;

public class Circulo {
	public double radio;
	public Circulo() {
		this (179066/1000);
	}
	public Circulo(double valor) {
		 this.radio=valor;	
	}
	
	public double calculararea() {
		return Math.PI*Math.pow(radio,2);
	}
	public double calculocircunferencia() {
		return (Math.PI*radio*2);
		
	}
	public double calculodiametro() {
		return (radio*2) ;
		
	}
	}
