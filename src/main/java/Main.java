import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ListaSE<Libro> libros = new ListaSE<>();
        ListaSE<Revista> revistas = new ListaSE<>();
        ListaSE<Periodico> periodicos = new ListaSE<>();

        Libro libro = new Libro(Color.COLOR,"Goma",29,"Ivan","La vida de los If's","454545",libros);
        Revista revista = new Revista(Color.BLANCONEGRO,"Coc",8,"Un dia un for","Diario",Periocidad.SEMANAL,new Date());
        Periodico periodico = new Periodico(Color.COLOR,"Whilers",12,"Marca",new Date());

        libros.addHead(new Libro(Color.COLOR,"Goma",29,"Ivan","La vida de los If's","454545",libros));
        libros.addHead(new Libro(Color.BLANCONEGRO,"Verde",20,"Jose","La vida de los While's","4545845",libros));
        revistas.addHead(new Revista(Color.BLANCONEGRO,"Coc",8,"Un dia un for","Diario",Periocidad.SEMANAL,new Date()));
//        periodicos.addHead(new Periodico(Color.COLOR,"Whilers",12,"Marca",new Date()));

//        System.out.println(libros);

       // libro.devolucion(new Libro(Color.COLOR,"Goma",29,"Ivan","La vida de los If's","454545",libros),1);

        System.out.println(revistas);

    }
}
