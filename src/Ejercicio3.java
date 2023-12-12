public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce 10 numeros enteros:");
        int [] n = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+"º número: ");
            n [i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Números en orden inverso");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i+1+"º número: "+n[i]);
        }
    }
}
