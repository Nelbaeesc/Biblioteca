public class Libro extends Publicacion {

    private String autor;
    private String titulo;
    private String ISBN;
    private ListaSE<Ejemplar> listaEjemplares;

    public Libro(Color impresion, String editorial, int numPag, String autor, String titulo, String ISBN, ListaSE listaEjemplares) {
        super(impresion, editorial, numPag);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.listaEjemplares = new ListaSE<>();
    }

    public boolean prestamo(Ejemplar ejemplar, int cantidad){
        boolean prestado = false;

        if (listaEjemplares.getSize() == 0)
            return false;

        if (cantidad < listaEjemplares.getSize() && cantidad != 0){
            listaEjemplares.removeTail(ejemplar);
            prestado = true;
        }
        return prestado;
    }

    public boolean devolucion(Ejemplar ejemplar, int cantidad){
        boolean devuelto = false;

        if (listaEjemplares.getSize() == 0)
            return true;

        if (cantidad < listaEjemplares.getSize() && cantidad != 0){
            listaEjemplares.addTail(ejemplar);
            devuelto = true;
        }
        return devuelto;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Ejemplar de libro{ " + "\n"+
                "ISBN: " + ISBN + "\n";
    }
}
