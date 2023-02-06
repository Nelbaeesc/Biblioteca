public class Cliente {

    private String nombre;
    private String DNI;
    private boolean activo;
    private ListaSE<Ejemplar> prestamos;
    private final int maxLibrosPrestados = 3;

    public Cliente(String nombre, String DNI, ListaSE prestamos){
        this.nombre = nombre;
        this.DNI = DNI;
        this.prestamos = new ListaSE<>();
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public ListaSE<Ejemplar> getPrestamos() {
        return prestamos;
    }
}
