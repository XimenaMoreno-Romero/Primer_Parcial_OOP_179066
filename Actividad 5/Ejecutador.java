package ACT5;
import java.util.Random;

public class Ejecutador {
	public void IniciarPrograma() {
		
		        Random random = new Random();
		        String[] nombres = {"Simba", "Pancho", "Nick", "Bullwinkle", "Mishi", "Toby", "Arnold", "Pedro", "Firulais", "Rocket"};
		        Animal[] animales = new Animal[10];

		        for (int i = 0; i < 10; i++) {
		        	int indiceAleatorio = random.nextInt(nombres.length);
		            String nombre = nombres[indiceAleatorio];
		            int vida = random.nextInt(10) + 1;
		            boolean esCarnivoro = random.nextBoolean();

		            int eleccion = random.nextInt(3);
		            Animal animal;

		            if (eleccion == 0) {
		                animal = new Mamifero(nombre, vida, esCarnivoro);
		            } else if (eleccion == 1) {
		                animal = new Ave(nombre, vida, esCarnivoro);
		            } else {
		                animal = new Pez(nombre, vida, esCarnivoro);
		            }

		            animales[i] = animal;
		        }

		        for (Animal animal : animales) {
		            System.out.println("Nombre:" + animal.getnombre());
		            System.out.println("Años de vida : " + animal.getedad());
		            System.out.println("Es carnivoro : " + animal.esCarnivoro());

		            if (animal instanceof Mamifero) {
		                Mamifero mamifero = (Mamifero) animal;
		                System.out.println("Es un  " + mamifero.getMamifero());
		                System.out.println("Numero de extremidades   " + mamifero.getNumerodePiernas());
		                System.out.println("Conoce a Judy Hops " + mamifero.getconoceaJudy());
		                mamifero.seComunicacomo();
			            mamifero.seMueve();
		            } else if (animal instanceof Ave) {
		                Ave bird = (Ave) animal;
		                System.out.println("Tipo de Ave: " + bird.getTipoAve());
		                System.out.println("Puede Volar " + bird.getpuedeVolar());
		                System.out.println("Color de su pico  " + bird.getcolorpico());
		               System.out.println("Conoce al pajaro loco: " + bird.getconoceapajaroLoco());
		               bird.seComunicacomo();
		               bird.seMueve();
		            } else if (animal instanceof Pez) {
		                Pez pez1 = (Pez) animal;
		                System.out.println("Es un  pez " + pez1.gettipodePez());
		                System.out.println("Habita en : " + pez1.getHabitad());
		                System.out.println("Es de agua salada " + pez1.getesdeAguaSalada());
		                System.out.println("Conoce a Nemo " + pez1.getconoceaNemo());
		                pez1.seComunicacomo();
			            pez1.seMueve();
		            }

		            System.out.println();
		        }
		    }
		

	}


