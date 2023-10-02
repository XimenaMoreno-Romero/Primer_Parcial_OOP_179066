package ACT5;

import java.util.Random;

public class Pez extends Animal {
    private String habitad;
    private boolean esdeAguaSalada;
    private String tipodepez;
    private boolean conoceaNemo;

    public Pez(String nombre, int vida, boolean esCarnivoro) {
        super(nombre, vida, esCarnivoro);
        Random random = new Random();
        this.habitad = Asignahabitad();
        this.esdeAguaSalada = random.nextBoolean();
        this.tipodepez =Tipodepez() ;
    }

    @Override
    public void seComunicacomo() {
        System.out.println(getnombre() + " se comunica como glugluglgu.");
    }
    @Override
    public void seMueve() {
        System.out.println(getnombre() + " Se mueve a un lugar más comodo");
    }

    public String getHabitad() {
        return habitad;
    }

    public boolean getesdeAguaSalada() {
        return esdeAguaSalada;
    }

    public boolean getconoceaNemo() {
        return conoceaNemo;
    }
    public String gettipodePez() {
    	return tipodepez;
    }

    private String Asignahabitad() {
        String[] colors = {"Arrecife", "Fondos Negros", "Fondos Blancos", "Rocas"};
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
    private String Tipodepez() {
        String[] peces = {"Payaso", "Globo", "Espada", "Leon"," Gato"};
        Random random = new Random();
        int eleccion = random.nextInt(peces.length);
        return peces[eleccion];
    }
}

