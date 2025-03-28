package actividad2;
abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularAreaFigura();
    public abstract boolean esRegular();
}
