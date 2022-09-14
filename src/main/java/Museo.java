import java.time.LocalDateTime;
public class Museo extends RecursoMuseo {
    private Tanque tanque;
    private Soldado soldado;
    private Buque buque;

    public Museo(Tanque tanque, LocalDateTime fecha){
        super(fecha);
        this.setTanque(tanque);
    }
    public Museo(Soldado soldado, LocalDateTime fecha){
        super(fecha);
        this.setSoldado(soldado);
    }
    public Museo(Buque buque, LocalDateTime fecha){
        super(fecha);
        this.setBuque(buque);
    }

    
    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
    public Tanque getTanque() {
        return tanque;
    }
    public void setBuque(Buque buque) {
        this.buque = buque;
    }
    public Buque getBuque() {
        return buque;
    }
    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }
    public Soldado getSoldado() {
        return soldado;
    }

}
