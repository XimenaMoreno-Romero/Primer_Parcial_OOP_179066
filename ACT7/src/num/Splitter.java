package num;

import java.util.ArrayList;
import java.util.List;

public class Splitter {
	public static List<Integer> getPares(List<Integer> ListaFibonacci) {
        List<Integer> ListaPares = new ArrayList<>();
        for (int num : ListaFibonacci) {
            if (num % 2 == 0) {
                ListaPares.add(num);
            }
        }
        return ListaPares;
    }

    public static List<Integer> getImpares(List<Integer> ListaFibonacci) {
        List<Integer> ListaImpares = new ArrayList<>();
        for (int num : ListaFibonacci) {
            if (num % 2 != 0) {
               ListaImpares.add(num);
            }
        }
        return ListaImpares;
    }

   
}