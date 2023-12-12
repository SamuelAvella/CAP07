public class Ejercicio2Bi {
    public static void main(String[] args) {
        int [][] num = new int [4][5];
        int sumfilas = 0;
        int sumcolum = 0;
        int sumtotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Fila %d Columna %d: ",i,j);
                num[i][j]= Integer.parseInt(System.console().readLine());
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            sumfilas = 0;
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                sumfilas += num[i][j];
                sumtotal += num[i][j];
                System.out.printf("%10d         |",num[i][j]);
            }
            
            System.out.printf(" E fila %d: %4d |%n",i,sumfilas);
        }
        System.out.print("|");
        for (int j = 0; j < 5; j++) {
            sumcolum = 0;
            for (int i = 0; i < 3; i++) {
                sumcolum+=num[i][j];
            }           
            System.out.printf(" E columna %d: %4d |", j, sumcolum);
        }
        System.out.printf(" TOTAL : %6d |",sumtotal);
    }
}
