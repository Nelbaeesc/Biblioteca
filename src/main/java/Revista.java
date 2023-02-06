import java.util.Date;

public class Revista extends Publicacion{

    private String nombre;
    private String tematica;
    private Periocidad periocidad;
    private Date fechaPublicacion;
    private int ejemplares = 1;

    public Revista(Color impresion, String editorial, int numPag, String nombre, String tematica, Periocidad periocidad) {
        super(impresion, editorial, numPag);
        this.nombre = nombre;
        this.tematica = tematica;
        this.periocidad = periocidad;
    }

    public boolean prestamo(int cantidad, Revista revista){
        boolean prestado = false;

        if (ejemplares == 0)
            return false;

        if (cantidad == 1 && ejemplares == 1){
            ejemplares--;
            prestado = true;
        }
        return prestado;
    }

    public boolean devolucion(int cantidad, Revista revista){
        boolean devuelto = false;

        if (ejemplares == 1 )
            return false;

        if (cantidad == 1 && ejemplares<1){
            ejemplares++;
            devuelto = true;
        }
        return devuelto;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Revista { " + "\n"+
                "Nombre: " + nombre + "\n"+
                "Fecha de publicacion: " + fechaPublicacion;
    }
}
