package ACT5;

import java.util.Random;

public class Mamifero extends Animal {
    private String queMamiferoes;
    private int Piernas;
    private boolean conoceaJudyHops;

    public Mamifero(String nombre, int vida, boolean esCarnivoro) {
        super(nombre, vida, esCarnivoro);
        Random random = new Random();
        this.queMamiferoes = AsignaTipodemamifero();
        this.Piernas = random.nextInt(4)+1;
        this.conoceaJudyHops = random.nextBoolean();
    }

    @Override
    public void seComunicacomo() {
        System.out.println(getnombre() + " Se comunica como mamifero");
    }
    @Override
    public void seMueve() {
        System.out.println(getnombre() + " Se mueve a un lugar más comodo");
    }
    

    public String getMamifero (){
        return this.queMamiferoes;
    }

    public int getNumerodePiernas() {
        return this.Piernas;
    }

    public boolean getconoceaJudy() {
        return this.conoceaJudyHops;
    }

    private String AsignaTipodemamifero() {
        String[] mamifero = {"Oso", "Perro", "Gato", "Conejo","Mapache"};
        Random random = new Random();
        int eleccion = random.nextInt(mamifero.length);
        return mamifero[eleccion];
    }
}
