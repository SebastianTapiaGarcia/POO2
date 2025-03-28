package actividad2;
import java.util.List;
public class SuperficiePlana{
    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana(List<FiguraGeometrica> figurasGeometricas) {
        this.figurasGeometricas = figurasGeometricas;
    }

    public void mostrarAreas(){
        for(FiguraGeometrica figura : figurasGeometricas){
            System.out.print("Figura: " + figura.getNombre() + '\n' + "Area: " + figura.calcularAreaFigura());
        }
    }
}
