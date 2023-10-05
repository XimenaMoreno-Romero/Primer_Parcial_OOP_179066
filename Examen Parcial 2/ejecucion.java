import java.util.Random;
import java.util.Scanner;

public class ejecucion {
    public void ejecutarPrograma(){
        Random rand = new Random();
        int RandNum;
        int contador = 0;
        int pokemonElegido = rand.nextInt(15);
        String eleccionNombre;
        String eleccionTipo;
        String eleccionPoder;
        Scanner scan = new Scanner(System.in);
        int input;
        Ataques ataq = new Ataques();
        Pokemon[] listaDePokemones = new Pokemon[15];
        Pokemon[] listaPokemonRevuelta = new Pokemon[15];
        Boolean[] checklist = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        for (int j = 0; j < 5; j++) {
                Pokemon agua1 = new Agua(j);
                Pokemon fuego1 = new Fuego(j);
                Pokemon planta1 = new Planta(j);
                listaDePokemones[contador] = agua1;
                listaDePokemones[contador + 1] = fuego1;
                listaDePokemones[contador + 2] = planta1;
                contador+=3;
        }
        for (int i = 0; i < listaDePokemones.length;) {
            RandNum = rand.nextInt(listaDePokemones.length);
            if (!checklist[RandNum]) {
                listaPokemonRevuelta[RandNum] = listaDePokemones[i];
                checklist[RandNum] = true;
                i++;
            }
        }
        System.out.println("Bienvenido a 'Who's that pokemon?'");
        System.out.println("Estos son todos los pokemones posibles:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < listaPokemonRevuelta.length; i++) {
            listaPokemonRevuelta[i].printPokemon();
        }
        System.out.println("--------------------------------------");
        System.out.println("Debes adivinar que pokemon es el correcto");
        do {
            System.out.println("Que deseas preguntar?: ");
            System.out.println("1) Nombre");
            System.out.println("2) Tipo");
            System.out.println("3) Poder");
            System.out.println("0) Salir");
            input = Integer.parseInt(scan.nextLine());
            switch (input){
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("Los pokemones aun disponibles son: ");
                    for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                        if (listaPokemonRevuelta[i] != null) {
                            listaPokemonRevuelta[i].printPokemon();
                        }
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("Su nombre es? (ingrese un nombre de pokemon textualmente como en la lista)");
                    eleccionNombre = scan.nextLine();
                    if(listaPokemonRevuelta[pokemonElegido].getNombrePokemon().equals(eleccionNombre)){
                        System.out.println("Ganaste! el pokemon es: " + listaPokemonRevuelta[pokemonElegido].getNombrePokemon());
                        input = 0;
                    }else {
                        System.out.println("El pokemon no es " + eleccionNombre);
                        for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                            if (listaPokemonRevuelta[i] != null) {
                                if (listaPokemonRevuelta[i].getNombrePokemon().equals(eleccionNombre)) {
                                    listaPokemonRevuelta[i] = null;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("--------------------------------------");
                    System.out.println("Los pokemones aun disponibles son: ");
                    for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                        if (listaPokemonRevuelta[i] != null) {
                            listaPokemonRevuelta[i].printPokemon();
                        }
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("Es de tipo ____? (Escriba el tipo en mayusculas): ");
                    eleccionTipo = scan.nextLine();
                    if (listaPokemonRevuelta[pokemonElegido].getTipoPokemon().equals(eleccionTipo)) {
                        System.out.println("El pokemon es de tipo " + eleccionTipo);
                        for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                            if(listaPokemonRevuelta[i] != null){
                                if (!listaPokemonRevuelta[i].getTipoPokemon().equals(eleccionTipo)){
                                    listaPokemonRevuelta[i] = null;
                                }
                            }
                        }
                    }else {
                        System.out.println("El pokemon no es de tipo " + eleccionTipo);
                        for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                            if (listaPokemonRevuelta[i] != null) {
                                if (listaPokemonRevuelta[i].getTipoPokemon().equals(eleccionTipo)) {
                                    listaPokemonRevuelta[i] = null;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    System.out.println("Los pokemones aun disponibles son: ");
                    for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                        if (listaPokemonRevuelta[i] != null) {
                            listaPokemonRevuelta[i].printPokemon();
                        }
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("Tiene el ataque _____? (Escriba el ataque textualmente)");
                    eleccionPoder = scan.nextLine();
                    if (listaPokemonRevuelta[pokemonElegido].getPoder1().equals(eleccionPoder) || listaPokemonRevuelta[pokemonElegido].getPoder2().equals(eleccionPoder) || listaPokemonRevuelta[pokemonElegido].getPoder3().equals(eleccionPoder) || listaPokemonRevuelta[pokemonElegido].getPoder4().equals(eleccionPoder)) {
                        System.out.println("El pokemon si tiene el ataque " + eleccionPoder);
                        for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                            if (listaPokemonRevuelta[i] != null) {
                                if (!(listaPokemonRevuelta[i].getPoder1().equals(eleccionPoder) || listaPokemonRevuelta[i].getPoder2().equals(eleccionPoder) || listaPokemonRevuelta[i].getPoder3().equals(eleccionPoder) || listaPokemonRevuelta[i].getPoder4().equals(eleccionPoder))) {
                                    listaPokemonRevuelta[i] = null;
                                }
                            }
                        }
                    }else {
                        System.out.println("El pokemon no tiene el ataque " + eleccionPoder);
                        for (int i = 0; i < listaPokemonRevuelta.length; i++) {
                            if (listaPokemonRevuelta[i] != null) {
                                if (listaPokemonRevuelta[i].getPoder1().equals(eleccionPoder) || listaPokemonRevuelta[i].getPoder2().equals(eleccionPoder) || listaPokemonRevuelta[i].getPoder3().equals(eleccionPoder) || listaPokemonRevuelta[i].getPoder4().equals(eleccionPoder)) {
                                    listaPokemonRevuelta[i] = null;
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del juego");
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
                    break;
            }
        }while (input != 0);
    }
}
