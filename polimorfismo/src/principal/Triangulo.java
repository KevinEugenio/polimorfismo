package principal;

public class Triangulo extends FIGURA{
    private int lados;

    public Triangulo(int lados, String TipoFigura, String color) {
        super(TipoFigura, color);
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }
    public String MostrarDatos(){
        return "Tipo de Figura: "+ TipoFigura + "\nSu Color es: "+color+"\nSus Lados son: "+lados;
    }
}
