public class Soldado extends Tropa {
    private Cuchillo cutuCuchillo;
    private Ametralladora boomStick;
    public Soldado(String nombre, Float daño, Float vida, Cuchillo armaMelee, Ametralladora armaRango) {
        super(nombre, daño, vida);
        this.setArmaMelee(armaMelee);
        this.setArmaRango(armaRango);
        
    }
    public Cuchillo getArmaMelee() {
        return cutuCuchillo;
    }
    public void setArmaMelee(Cuchillo arma) {
        this.cutuCuchillo = arma;
    }
    public Ametralladora getArmaRango() {
        return boomStick;
    }
    public void setArmaRango(Ametralladora arma) {
        this.boomStick = arma;
    }
    public float danioMelee(){
        return this.getArmaMelee().getDanio() * this.getDaño();
    }
    public float danioDistancia(){
        this.getArmaRango().setMunicion(this.getArmaRango().getMunicion() - 1);
        return this.getArmaRango().getDanio() * this.getDaño();
    }

}
