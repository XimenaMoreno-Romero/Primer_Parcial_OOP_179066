package num;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
    public static void execute() {
    	
        List<Integer> ListaFib = Fibonacci.generaFibonacci(1000000);
        List<Integer> NumPares = Splitter.getPares(ListaFib);
        List<Integer> NumImpares = Splitter.getImpares(ListaFib);
        guardaenDocumento("Fibonacci.txt", ListaFib);
        guardaenDocumento("Pares.txt", NumPares);
        guardaenDocumento("Impares.txt", NumImpares);
    }
        

private static void guardaenDocumento(String NombreArchivo, List<Integer> numeros) {
    try {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(NombreArchivo));
        for (int num : numeros) {
            escritor.write(Integer.toString(num));
            escritor.newLine();
        }
        escritor.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

