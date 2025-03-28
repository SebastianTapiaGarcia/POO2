package actividad2;
public class Punto {
    int coordenada_x;
    int coordenada_y;

    public Punto(){
    }
    
    public Punto(int coordenada_x, int coordenada_y) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }
    
    public double getDistancia(){
        return getDistancia(new Punto());
    }
    
    public double getDistancia(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.getCoordenada_x() - this.coordenada_x, 2) + Math.pow(otroPunto.getCoordenada_y() - this.coordenada_y, 2));
    }
    
    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + "," + coordenada_y;
    }
}
