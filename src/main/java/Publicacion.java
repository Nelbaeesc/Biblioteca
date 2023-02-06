public class Publicacion {

    private Color impresion;
    private String editorial;
    private int numPag;
    private ListaSE<Publicacion> publicaciones;

    public Publicacion(Color impresion, String editorial, int numPag){
        this.impresion = impresion;
        this.editorial = editorial;
        this.numPag = numPag;
    }
    public Color getImpresion(){
        return impresion;
    }
    public String getEditorial(){
        return editorial;
    }
    public int getNumPag(){
        return numPag;
    }

    public void darAlta(Publicacion publicacion){
        publicaciones.addHead(publicacion);
    }
//    public void darBaja(Publicacion publicacion){
//        publicaciones.removeTail(publicacion);
//    }

    @Override
    public String toString(){
        return "Publicacion { " + "\n"+
                "Color de impresion: " + impresion + "\n"+
                "Editorial: " + editorial + "\n"+
                "Número de páginas: " + numPag + " }"+ "\n"+"\n";
    }
}
