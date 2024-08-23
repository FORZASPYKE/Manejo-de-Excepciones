import java.util.Scanner;

class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {
        super();
    }
    public NumeroNegativoExcepcion(String message) {
        super(message);
    }
}

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero : ");
        int num = sc.nextInt();

        try{
            if(num<0){
                throw new NumeroNegativoExcepcion("Debe ingresar un numero mayor o igual a 0");
            }else {
                System.out.println("La raiz cuadrada de "+num+" es: "+ (Math.sqrt(num)));
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
