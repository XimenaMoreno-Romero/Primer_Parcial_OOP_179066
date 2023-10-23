public abstract class Pokemon {
    private String nombrePokemon, tipoPokemon, poder1, poder2, poder3, poder4;

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public void setPoder1(String poder1) {
        this.poder1 = poder1;
    }

    public void setPoder2(String poder2) {
        this.poder2 = poder2;
    }

    public void setPoder3(String poder3) {
        this.poder3 = poder3;
    }

    public void setPoder4(String poder4) {
        this.poder4 = poder4;
    }
    public String getNombrePokemon(){
        return this.nombrePokemon;
    }
    public String getTipoPokemon(){
        return this.tipoPokemon;
    }
    public String getPoder1(){
        return this.poder1;
    }
    public String getPoder2(){
        return this.poder2;
    }
    public String getPoder3(){
        return this.poder3;
    }
    public String getPoder4(){
        return this.poder4;
    }
    public void printPokemon(){
        System.out.println(getNombrePokemon() + " : " + getTipoPokemon() + " : " + getPoder1() + ", " + getPoder2() + ", " + getPoder3() + ", " + getPoder4());
    }
}
