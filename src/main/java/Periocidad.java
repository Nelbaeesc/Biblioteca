public enum Periocidad {

    SEMANAL("Semanal"), MENSUAL("Mensual"), TRIMESTRAL("Trimestral");

    private String periocidad;

    Periocidad(String periocidad){
        this.periocidad = periocidad;
    }
    @Override
    public String toString(){
        return "Periocidad: " + periocidad;
    }
}
