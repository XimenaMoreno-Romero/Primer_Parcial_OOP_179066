import java.io.*;
import java.util.Scanner;

public class Menu {
    public void menudeEjecucionCompleta() {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego Adivina Quién");

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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Jugar Adivina Quién");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

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
                   else {
                	   perdidas++;
                   }
                    break;
                case 2:
                    System.out.println("\nEstadísticas de " + nombreJugador);
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
                    System.out.println("¡Gracias por jugar! Hasta la próxima.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
    }

}
