import java.time.LocalDate;
import java.util.Date;

public class Prestamo<T> {

    private LocalDate prestado;
    private Date devuelto;
    private T info;

    public Prestamo(LocalDate prestado, Date devuelto, T info) {
        this.prestado = prestado;
        this.devuelto = devuelto;
        this.info = info;
    }

}
