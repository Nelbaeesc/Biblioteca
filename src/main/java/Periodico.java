import java.util.Date;

public class Periodico extends Publicacion {

    private String nombre;
    private Date diaPublicacion;
    private int ejemplares = 1;

    public Periodico(Color impresion, String editorial, int numPag, String nombre, Date diaPublicacion) {
        super(impresion, editorial, numPag);
        this.nombre = nombre;
        this.diaPublicacion = new Date();
    }

    public boolean prestamo(int cantidad, Periodico periodico){
        boolean prestado = false;

        if (ejemplares == 1)
            return false;

        if (cantidad == 1 && periodico.ejemplares == 1){
            ejemplares--;
            prestado = true;
        }
        return prestado;
    }

    public boolean devolucion(int cantidad, Periodico periodico){
        boolean devuelto = false;

        if (ejemplares == 1)
            return false;

        if (cantidad == 1 && periodico.ejemplares < 1){
            ejemplares++;
            devuelto = true;
        }
        return devuelto;
    }

    @Override
    public String toString(){
        return super.toString()+
                "Periodico { " + "\n"+
                "Nombre: " + nombre + "\n"+
                "Fecha de publicación: " + diaPublicacion;
    }
}
