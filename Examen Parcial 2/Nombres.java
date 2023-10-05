import java.util.Random;
public class Nombres {
    private String[][] nombresPoke = {{"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly"}, {"Charmander", "Cyndaquil", "Torchic", "Litten", "Fuecoco"}, {"Bulbasaur", "Chikorita", "Treecko", "Rowlet", "Sprigatito"}};
    private String nombreElegido;
    private Random rand = new Random();
    public String getNombre(int tipo, int nombre){
        nombreElegido = nombresPoke[tipo][nombre];
        return nombreElegido;
    }
}
