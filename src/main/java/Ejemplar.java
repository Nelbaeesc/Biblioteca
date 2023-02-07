public class Ejemplar {

    private int codigo;
    private Libro libro;
    private ListaSE<Prestamo> prestamos;

    public Ejemplar(int codigo, Libro libro){
        this.codigo = codigo;
        this.libro = libro;
    }

    public int getCodigo(){
        return codigo;
    }

    public Libro getLibro() {
        return libro;
    }

    public ListaSE<Prestamo> getPrestamos() {
        return prestamos;
    }

}
