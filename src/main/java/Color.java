public enum Color {
    COLOR("A color"), BLANCONEGRO("En blanco y negro");

    private String color;

    Color(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return "" + color;
    }
}