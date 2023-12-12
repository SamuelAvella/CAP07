public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numero = new int[15];
        System.out.println("Introduce 15 numeros enteros:");
        for (int i = 0; i < 15; i++) {
            numero [i] = Integer.parseInt(System.console().readLine());
        }
        int ultimo = numero [14];
        for (int i = 14; i > 0 ; i--) {
            numero [i]= numero [i-1];
        }
        numero [0]=ultimo;
        System.out.println("Array con posición una a la derecha desde 0 hasta 14: ");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
    }
}
