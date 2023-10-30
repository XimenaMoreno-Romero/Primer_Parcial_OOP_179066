package num;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	
	    public static List<Integer> generaFibonacci(int limite) {
	        List<Integer> ListadeNum = new ArrayList<>();
	        ListadeNum.add(0);
	        ListadeNum.add(1);
	        int a = 0;
	        int b = 1;

	        for (int i = 2; b <= limite; i++) {
	            int temp = b;
	            b = a + b;
	            a = temp;
	            ListadeNum.add(b);
	        }
	        
	      return ListadeNum;
  }
}

