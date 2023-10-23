public class Fuego extends Pokemon{
    private Nombres nom1 = new Nombres();
    private Ataques ataques1 = new Ataques();
    public Fuego(int nombrePokemon){
        setTipoPokemon("FUEGO");
        setNombrePokemon(nom1.getNombre(1, nombrePokemon));
        setPoder1(ataques1.getPoderElegido());
        do {
            setPoder2(ataques1.getPoderElegido());
        }while (getPoder1() == getPoder2());
        do {
            setPoder3(ataques1.getPoderElegido());
        }while ((getPoder1() == getPoder3()) || (getPoder2() == getPoder3()));
        do {
            setPoder4(ataques1.getPoderElegido());
        }while ((getPoder1() == getPoder4()) || (getPoder2() == getPoder4()) || (getPoder3() == getPoder4()));
    }
}
