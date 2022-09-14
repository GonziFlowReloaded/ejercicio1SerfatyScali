import java.sql.Date;
public class Museo extends RecursoMuseo {
    private Buque buque;
    private Soldado soldado;
    private Tanque tanque;



    
    public Museo(Buque buque, Date fecha) {
        super(fecha);
        this.setBuque(buque);
    }
    public Museo(Soldado soldado, Date fecha) {
        super(fecha);
        this.setSoldado(soldado);
    }
    public Museo(Tanque tanque, Date fecha){
        super(fecha);
        this.setTanque(tanque);
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
    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
    public Tanque getTanque() {
        return tanque;
    }
}
