import java.util.Random;
public class Ataques {
    private String[] listaDePoderes = {"Hydro pump", "Solar Beam", "Eruption", "Flamethrower", "Aqua Jet", "Whirlpool", "Synthesis", "Petal Dance"};
    private String poderElegido;
    private Random rand = new Random();
    public String getPoderElegido(){
        poderElegido = listaDePoderes[rand.nextInt(8)];
        return poderElegido;
    }
    public String getPoder(int x){
        return listaDePoderes[x];
    }
}
