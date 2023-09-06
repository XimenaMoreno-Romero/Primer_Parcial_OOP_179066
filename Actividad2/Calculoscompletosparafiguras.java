package calculoparafiguras;

public class Calculoscompletosparafiguras {
	public static  void main(String[] args) {
		Circulo  calculosparacirculo= new Circulo (179066);
		Cuadrado calculosparacuadrado= new Cuadrado (179066);
		System.out.println("ID:179066");
		System.out.println("Calculos Para Circulo");
		System.out.println("radio= "+ calculosparacirculo.radio);
		System.out.println("area= "+calculosparacirculo.calculoarea());
		System.out.println("Circunferencia "+calculosparacirculo.calculocircunferencia());
		System.out.println("Calculos para Cuadrado");
		System.out.println("diagonal="+calculosparacuadrado.calculodiagonal());
		System.out.println("area="+calculosparacuadrado.calculoarea());
		System.out.println("Perimetro="+calculosparacuadrado.calculoperimetro());

		}
}
