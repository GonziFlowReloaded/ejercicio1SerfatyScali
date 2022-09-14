import java.time.LocalDateTime;


public class RecursoMuseo {
    private LocalDateTime fecha;
    
    public RecursoMuseo(LocalDateTime fecha){
        this.setFecha(fecha);
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
