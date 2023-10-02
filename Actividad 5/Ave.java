package ACT5;

import java.util.Random;

public class Ave extends Animal {
    private String colorPico;
    private boolean puedeVolar;
    private boolean conoceaPajaroLoco;
    private String Tipodeave;

    public Ave(String nombre, int vida, boolean esCarnivoro) {
        super(nombre, vida, esCarnivoro);
        Random random = new Random();
        this.colorPico = generaColorPico();
        this.puedeVolar = random.nextBoolean();
        this.conoceaPajaroLoco = random.nextBoolean();
        this.Tipodeave=AsignaTipodeAve();
    }

    @Override
    public void seComunicacomo() {
        System.out.println(getnombre() + " se comunica como ave ");
    }
    @Override
    public void seMueve() {
        System.out.println(getnombre() + " Se mueve a un lugar más comodo");
    }
    public String getTipoAve() {
        return Tipodeave;
    }

    public String getcolorpico() {
        return colorPico;
    }

    public boolean getpuedeVolar() {
        return puedeVolar;
    }

    public boolean getconoceapajaroLoco() {
        return conoceaPajaroLoco;
    }

    private String generaColorPico() {
        String[] colores = {"Rojo", "Amarillo", "Negro", "Azul"};
        Random random = new Random();
        int eleccion = random.nextInt(colores.length);
        return colores[eleccion];
    }
    private String AsignaTipodeAve() {
        String[] ave = {"Colibri", "Halcon", "Aguila", "Gallo","Pelicano"};
        Random random = new Random();
        int eleccion = random.nextInt(ave.length);
        return ave[eleccion];
    }
}

