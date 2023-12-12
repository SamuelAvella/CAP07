public class Ejercicio2 {
    public static void main(String[] args) {
        char [] n = new char [10];
        n [0] = 'a';
        n [1] = 'x';
        n [4] = '@';
        n [6] = ' ';
        n [7] = '+';
        n [8] = 'Q';
        System.out.println("Índice  0  1  2  3  4  5  6  7  8  9");
        System.out.print(" Valor");
        for (int i = 0; i < 10; i++) {
            System.out.print("  "+n[i]);
        }
    }
}
