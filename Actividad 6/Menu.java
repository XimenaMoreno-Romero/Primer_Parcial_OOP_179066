import java.io.*;
import java.util.Scanner;

public class Menu {
    public void menudeEjecucionCompleta() {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreJugador = scanner.nextLine();

        int jugadas = 0;
        int ganadas = 0;
        int perdidas = 0;
        String linea;

        File archivoEstadisticas = new File("estadisticas.txt");

        if (archivoEstadisticas.exists()) {
            try (BufferedReader archivoReader = new BufferedReader(new FileReader(archivoEstadisticas))) {
                while ((linea = archivoReader.readLine()) != null) {
                    if (linea.equals(nombreJugador)) {
                        jugadas = Integer.parseInt(archivoReader.readLine());
                        ganadas = Integer.parseInt(archivoReader.readLine());
                        perdidas = Integer.parseInt(archivoReader.readLine());
                        break;
                    }
                }
            } catch (IOException imprime) {
                imprime.printStackTrace();
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Jugar Adivina Quien");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    jugadas++;
                    new Ejecucion().ejecutarPrograma();
                    Ejecucion Ganó= new Ejecucion();
                    boolean WinOrLose=Ganó.getgano();
                    
                   if (WinOrLose== true) {
                	   ganadas++;
                   }
                   if (WinOrLose==false) {
                	   perdidas++;
                   }
                    break;
                case 2:
                    System.out.println("\nEstadisticas de " + nombreJugador);
                    System.out.println("Partidas jugadas: " + jugadas);
                    System.out.println("Partidas ganadas: " + ganadas);
                    System.out.println("Partidas perdidas: " + perdidas);
                    break;
                case 3:
                    
                    try (BufferedWriter archivoWriter = new BufferedWriter(new FileWriter(archivoEstadisticas, true))) {
                     boolean jugadorEncontrado = false;
                     try (BufferedReader archivoReader = new BufferedReader(new FileReader(archivoEstadisticas))) {
                     while ((linea = archivoReader.readLine()) != null) {
                                if (linea.equals(nombreJugador)) {
                                    jugadorEncontrado = true;
                                    break;
                                }
                            }
                        }
                        
                        if (!jugadorEncontrado) {
                            archivoWriter.write(nombreJugador);
                            archivoWriter.newLine();
                        }
                        
                        archivoWriter.write(String.valueOf(jugadas));
                        archivoWriter.newLine();
                        archivoWriter.write(String.valueOf(ganadas));
                        archivoWriter.newLine();
                        archivoWriter.write(String.valueOf(perdidas));
                        archivoWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("¡Gracias por jugar! ");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion del menú.");
            }
        }
    }

}

     
