public class Ejercicio1 {
    static char CaracterE(String caracter, int num) throws Exception {
        if(num >= 0 && num < caracter.length()){
            return caracter.charAt(num);
        }else{
            throw new Exception("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        String palabra = "caracol";
        try {
            char letra = CaracterE(palabra, n);
            System.out.println("La letra en la posicion "+n+" es "+letra);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
