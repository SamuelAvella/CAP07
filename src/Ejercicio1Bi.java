public class Ejercicio1Bi {
    public static void main(String[] args) {
        int [][] num = new int [3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Fila %d Columna %d: ",i,j);
                num[i][j]= Integer.parseInt(System.console().readLine());
            }
            System.out.println();
        }
        System.out.println("Array num  Columna 0  Columna 1  Columna 2  Columna 3  Columna 4  Columna 5 ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("  Fila %d  ",i);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%6d     ",num[i][j]);
            }
            System.out.println();
        }
    }
}
