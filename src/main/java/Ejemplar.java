public class Ejemplar {

    private int codigo;
    private Libro libro;
    private ListaSE<Ejemplar> listaEjemplares;
    private  Cliente cliente;
    private ListaSE<Prestamo> prestamos;

    public Ejemplar(int codigo, Libro libro, ListaSE listaEjemplares){
        this.codigo = codigo;
        this.libro = libro;
        this.listaEjemplares = new ListaSE<>();
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

    @Override
    public String toString(){
        return super.toString()+
                "Codigo: " + codigo + "\n"+
                "Libro: " + libro + "\n"+
                "Prestado a: " + cliente;
    }

}
