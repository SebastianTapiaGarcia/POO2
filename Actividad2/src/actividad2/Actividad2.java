package actividad2;
import java.util.List;
public class Actividad2 {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(3, 1);
        Punto punto3 = new Punto(2, 4);
        
        Triangulo triangulo = new Triangulo("Triangulo 1", punto1, punto2, punto3);
        List<FiguraGeometrica> figuras = List.of(triangulo);
        
        SuperficiePlana superficie = new SuperficiePlana(figuras);
        superficie.mostrarAreas();
    }
    
}
