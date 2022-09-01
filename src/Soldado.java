public class Soldado extends Tropa {
    private Cuchillo cutuCuchillo;
    public Soldado(String nombre, Float daño, Float vida, Cuchillo arma) {
        super(nombre, daño, vida);
        this.setArma(arma);
        
    }
    public Cuchillo getArma() {
        return cutuCuchillo;
    }
    public void setArma(Cuchillo arma) {
        this.cutuCuchillo = arma;
    }
    public float danioConArma(){
        return this.getArma().getDanio() * this.getDaño();
    }
    
}
