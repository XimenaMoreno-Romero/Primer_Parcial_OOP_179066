package calculosparafigurasCyC;
import java.util.Scanner;
public class Menuprincipalyejecucion {
	public static void main(String[] args) {
		while (true) {
		Scanner opcion= new Scanner(System.in);
		System.out.println("Bienvenido al programa para calcular medidas en circulos y cuadrados ");
		System.out.println("1. Circulo");
		System.out.println("2. Cuadrado");
		System.out.println("Presiona 3 para salir");
				System.out.println("Seleccione la opcion deseada");
				String seleccionop=opcion.nextLine();
				int opcionElegida= Integer.parseInt(seleccionop);
			
		switch(opcionElegida) {
		case 1:
			System.out.println("Elegiste Circulo");
			Scanner radio=new Scanner(System.in);
			System.out.println("Ingrese las medidas del radio");
			String medidaR= radio.nextLine();
			double medidaRadio=Double.parseDouble(medidaR);
			
			System.out.println("1. Area");
			System.out.println("2. Diametro");
			System.out.println("3. Circunferencia");
			System.out.println(" Presione 4 para regresar a menu principal");
			{
			Scanner opciondeCalculoCirculo= new Scanner(System.in);
			System.out.println("Seleccione la opcion deseada");
			String selecciondeopcion=opciondeCalculoCirculo.nextLine();
			int definitivaopcion=Integer.parseInt(selecciondeopcion);
			while(definitivaopcion==4) {
				if (definitivaopcion==1) {
				Circulo circulo1=new Circulo(medidaRadio);
				 System.out.println("Area"+ circulo1.calculararea());
			}
			if (definitivaopcion==2) {
				Circulo circulo1=new Circulo(medidaRadio);
				System.out.println("Diametro"+ circulo1.calculodiametro());
			}
			if (definitivaopcion==3) {
				Circulo circulo1=new Circulo(medidaRadio);
				System.out.println("Circunferencia"+ circulo1.calculocircunferencia());
			}
			if (definitivaopcion==4) {
				break;
			}
			}
			}
			
			break;
		case 2:
			System.out.println("Elegiste Cuadrado");
			Scanner lado=new Scanner(System.in);
			System.out.println("Ingrese las medidas del lado");
			String medidaL= lado.nextLine();
			double medidaLado=Double.parseDouble(medidaL);
			System.out.println("1. Area");
			System.out.println("2. Diagonal");
			System.out.println("3. Perimetro");
			System.out.println(" Presione 4 para regresar a menu principal");
			Scanner opciondeCalculoCuadrado= new Scanner(System.in);
			System.out.println("Seleccione la opcion deseada");
			String selecciondeopcion1=opciondeCalculoCuadrado.nextLine();
			int definitivaopcion1=Integer.parseInt(selecciondeopcion1);
			while (definitivaopcion1==4) {
				if (definitivaopcion1==1) {
				Cuadrado cuadrado1 = new Cuadrado(medidaLado);
				 System.out.println("Area"+ cuadrado1.calculararea());
			}
			if (definitivaopcion1==2) {
				Cuadrado cuadrado1 = new Cuadrado(medidaLado);
				System.out.println("Diagonal"+ cuadrado1.calculodiagonal());
			}
			if (definitivaopcion1==3) {
				Cuadrado cuadrado1 = new Cuadrado(medidaLado);
				System.out.println("Perimetro"+ cuadrado1.calculoperimetro());
			}
			if (definitivaopcion1==4) {
				break;
			}
			}
			
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		}
	}}}
