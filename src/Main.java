import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Introduce una palabra: ");
       String palabra = sc.nextLine();
       try {
           char letra = Ejercicio1.CaracterE(palabra, 7);
           System.out.println("La letra en la posicion "+ 7 +" es " + letra);
       }catch (Exception e){
           System.out.println("Error: " + e.getMessage());
       }
    }
}