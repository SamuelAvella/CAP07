public class Ejercicio4Bi {
    public static void main(String[] args) throws InterruptedException {
        int [][] num = new int [4][5];
        int sumfilas = 0;
        int sumcolum = 0;
        int sumtotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j]= (int)(Math.random()*900)+100;
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
            Thread.sleep(500);
            System.out.printf(" E fila %d: %4d |%n",i,sumfilas);
        }
        System.out.print("|");
        for (int j = 0; j < 5; j++) {
            sumcolum = 0;
            for (int i = 0; i < 3; i++) {
                sumcolum+=num[i][j];
            }   
            Thread.sleep(500);        
            System.out.printf(" E columna %d: %4d |", j, sumcolum);
        }
        Thread.sleep(500);
        System.out.printf(" TOTAL : %6d |",sumtotal);
    }
}
