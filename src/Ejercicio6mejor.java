public class Ejercicio6mejor {
    public static int[] obtenerValores (int valores) {
        int _valores = new int [valores];
        for (int i = 0; i < valores; i++) {
            _valores = Integer.parseInt(System.console().readLine());
        }
        return _valores;
    }
    public static void rotar (int [] valores){
        int ultimo = valores[valores.length-1];
        for (int i = valores-1; i > 0; i--) {
            valores [i] = valores [i-1];
        }
        valores [0] = ultimo;
    }
    public static void valormax (int [] valores){

    }

    public static void imprimirArray (int [] valores){
        int digitos = (""+valormax(valores)).length(); //calcuar longitud 
        for (int i = 0; i < valores.length; i++) 
            System.out.print("|%"+digitos+"d ",i);
        System.out.println();
    }
    public static void main(String[] args) {
        int [] valores = obtenerValores(0);
        System.out.println("Array original:");
        imprimirArray(valores);
        rotar(valores);
        System.out.println("Array rotado a la derecha una posición:");
        imprimirArray(valores);
    }
}
