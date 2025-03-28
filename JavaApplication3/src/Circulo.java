public class Circulo {
    private double radio = 12.5;
    private String color = "azul";

    public Circulo(){
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI*radio*radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Circulo {radio=" + radio + ", color='" + color + "', area=" + getArea() + "}";
    }
}
