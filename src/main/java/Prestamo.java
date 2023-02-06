import java.util.Date;

public class Prestamo {

    private Date prestado;
    private Date devuelto;
    private Cliente cliente;

    public Prestamo(Cliente cliente){
        this.cliente = cliente;
    }
}
