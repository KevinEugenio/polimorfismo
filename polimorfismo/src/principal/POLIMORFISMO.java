
package principal;

public class POLIMORFISMO {


    public static void main(String[] args) {
        FIGURA misFiguras [] = new FIGURA [5];
        
        misFiguras[0] = new FIGURA("Figuras Planas","Colores Primarios");//aqui todavia no se da el polimorfismo
        misFiguras[1] = new Circulo(2.5f,"CIRCULO","AZUL");//Desde aqui ya se da el polimorfismo porque se instancea con un hijo de FIGURA 
        misFiguras[2] = new Rectangulo(4,"RECTANGULO","AMARILLO");//Y porque su definicion dice que un objeto de la superclase
        misFiguras[3] = new Triangulo(3,"TRIANGULO","ROJO");//puede almacenar un objeto de cualquiera de sus 
        misFiguras[4] = new RectanguloRedondo("Redondeadas",4,"RECTANGULO REDONDO","AMARILLO");//subclases.
       
        for (FIGURA Figuras: misFiguras){
            System.out.println(Figuras.MostrarDatos());
            System.out.println("");
        }
    }
    
}
