
package principal;

public class Rectangulo extends FIGURA{
    protected int esquinas;

    public Rectangulo(int esquinas, String TipoFigura, String color) {
        super(TipoFigura, color);
        this.esquinas = esquinas;
    }

    public int getEsquinas() {
        return esquinas;
    }
    @Override
    public String MostrarDatos(){
        return "Tipo de Figura: "+TipoFigura+"\nSu color es: "+color+"\nSus Esquinas son: "+ esquinas;
    }
}
