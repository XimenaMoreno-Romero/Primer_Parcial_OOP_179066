package calculoparafiguras;

public class Circulo {
	public double  radio,circunferencia,area;
public Circulo(int ID) {
	radio=(double)ID/100;	
}
public double calculoarea() {
area=(Math.PI*Math.pow(radio,2));
return area;
}
public double calculocircunferencia() {
circunferencia=(Math.PI*radio*2);
return circunferencia;
}
}
