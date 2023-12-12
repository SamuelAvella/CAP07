public class Ejercicio1Bimejor {
    public static void imprimeMatriz (int [][] valores){
        System.out.printf("%10s","");
        for (int i = 0; i < valores[0].length; i++)
            System.out.printf("Columna%d   ",i);
        System.out.println();
        for (int i = 0; i < valores[0].length; i++) {
            System.out.printf("   Fila%d  ",i);
            for (int j = 0; j < valores[i].length; j++) {
                System.out.printf("%6d     ",valores[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] valores = new int [3][6];
        valores[0][0]=0;
        valores[0][1]=30;
        valores[0][2]=2;
        valores[0][5]=5;
        valores[1][0]=75;
        valores[1][4]=0;
        valores[2][2]=-2;
        valores[2][3]=9;
        valores[2][5]=11;
        imprimeMatriz(valores);
    }
}
