import java.sql.Date;


public class RecursoMuseo {
    private Date fecha;


    public RecursoMuseo(Date fecha) {
        this.setFecha(fecha);
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
