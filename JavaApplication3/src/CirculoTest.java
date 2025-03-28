public class CirculoTest {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        System.out.println("El radio por defecto es: " + circulo1.getRadio());
        System.out.println("El area por defecto es: " + circulo1.getArea());
        
        Circulo circulo2 = new Circulo(6.55);
        System.out.println("El radio con el constructor sobrecargado es: " + circulo2.getRadio());
        System.out.println("El area con el constructor sobrecargado es: " + circulo2.getArea());
        
        Circulo circulo3 = new Circulo();
        circulo3.setRadio(14);
        circulo3.setColor("rojo");
        
        System.out.println("Objeto modificado: " + circulo3.toString());
    }
}
