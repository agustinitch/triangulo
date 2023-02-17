public class Main {
    /**
     * Ejemplo  de Javadoc
     * @param args
     */
    public static void main(String[] args) {
        //Crea objeto de la clase que resuelve el problema
        Triangulo programa = new Triangulo(3,4,5);

        //Usa el objeto
        System.out.println("El area del triángulo de lados 3, 4 y 5 es: "
                + programa.calculaArea());

        //Destruye el objeto (en realidad lo prepara para destruir)
        programa = null;
    }
}


class Triangulo {
    //atributos (datos de la clase)
    int lado1;
    int lado2;
    int lado3;

    //métodos

    //constructor
    //Crear el objeto e inicializar sus atributos
    protected Triangulo(int lado1, int l2, int l3){
        this.lado1 = lado1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public double calculaArea(){
        //elegir un lado como la base y obtener la altura
        //calcular el semiperímetro
        double semiPerimetro = (this.lado1 + this.lado2 + this.lado3) / 2;  //6

        double altura = (2.0 / this.lado1) * Math.sqrt(semiPerimetro
                * (semiPerimetro - this.lado1) * (semiPerimetro - this.lado2) * (semiPerimetro - this.lado3));
        //(2/3) * raiz(6 * 3 * 2 * 1) = 2/3 * raiz(36) = 2/3 * 6 = 4

        //calcular el area
        double area = (this.lado1 * altura) / 2;   // (3 * 4) / 2 = 6

        return area;
    }

}