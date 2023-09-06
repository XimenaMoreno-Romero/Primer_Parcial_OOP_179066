package calculoparafiguras;

public class Cuadrado {

double lado,perimetro,area,diagonal;
public Cuadrado(int ID) {
	lado=(double)ID/100;
}
public double calculoperimetro() {
	perimetro=4*lado;
	return perimetro;
}
public double calculoarea() {
	area=lado*lado;
	return area;
}
public double calculodiagonal() {
diagonal= Math.sqrt(Math.pow(lado, 2)*2);
return diagonal;
}

	
}
