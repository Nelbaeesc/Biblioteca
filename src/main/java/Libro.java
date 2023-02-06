public class Libro extends Publicacion {

    private String autor;
    private String titulo;
    private String ISBN;
    private ListaSE<Libro> listaEjemplares;

    public Libro(Color impresion, String editorial, int numPag, String autor, String titulo, String ISBN, ListaSE listaEjemplares) {
        super(impresion, editorial, numPag);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.listaEjemplares = new ListaSE<>();
    }

//    public boolean prestamo(Libro libro, int cantidad){
//        boolean prestado = false;
//
//        if (listaEjemplares.getSize() == 0)
//            return false;
//
//        if (cantidad < listaEjemplares.getSize() && cantidad != 0){
//            listaEjemplares.removetail();
//            prestado = true;
//        }
//        return prestado;
//    }

    public boolean devolucion(Libro libro, int cantidad){
        boolean devuelto = false;

        if (cantidad < listaEjemplares.getSize() && cantidad != 0){
            listaEjemplares.addTail(libro);
            devuelto = true;
        }
        return devuelto;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Ejemplar de libro{ " + "\n"+
                "ISBN: " + ISBN + "\n";
    }
}