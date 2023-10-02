package ACT5;

public abstract class Animal {
	private String nombre;
    private int vida;
    private boolean esCarnivoro;
    public Animal(String nombre, int vida, boolean esCarnivoro) {
       this.nombre = nombre;
       this.vida = vida;
       this.esCarnivoro = esCarnivoro;
    }
    
    protected abstract void seComunicacomo();
    public abstract void seMueve();
    
    public String getnombre() {
return nombre;
}
    public int getedad() {
    	return vida;
    	}
    
    public boolean esCarnivoro() {
    	return esCarnivoro;
 }

	
}
