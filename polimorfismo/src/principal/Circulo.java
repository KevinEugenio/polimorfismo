package principal;

public class Circulo extends FIGURA{
    private float radio;

    public Circulo(float radio, String TipoFigura, String color) {
        super(TipoFigura, color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    @Override
    public String MostrarDatos(){
        return "Tipo de Figura: "+ TipoFigura+"\n Su color es: "+color+"\nSu Radio es: "+radio;
    }
    
}
