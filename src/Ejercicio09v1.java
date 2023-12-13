public class Ejercicio09v1{
    public static void main(String[] args){
        int ancho = 12;
        int[][] matriz = new int[ancho][ancho];
        for(int i = 0; i < ancho; i++)
            for(int j=0; j < ancho; j++)
                matriz[i][j]=(int)(Math.random()*101);

        for(int i = 0; i < ancho; i++){
            for(int j=0; j < ancho; j++)
                System.out.printf("%3d ",matriz[i][j]);   
            System.out.println();
        }
        
        int sq1,sq2,sq3,sq4;
        for(int capa = 0; capa < ancho/2; capa++){
            sq1 = matriz[capa][ancho-capa-1];
            sq2 = matriz[ancho-capa-1][ancho-capa-1];
            sq3 = matriz[ancho-capa-1][capa];
            sq4 = matriz[capa][capa];
            for(int i = ancho-capa-1; i > capa+1; i--){
                matriz[capa][i]=matriz[capa][i-1]; //Fila superior
                matriz[i][ancho-capa-1]=matriz[i-1][ancho-capa-1]; //Columna dcha
                matriz[ancho-capa-1][ancho-i-1]=matriz[ancho-capa-1][ancho-i];//Fila inferior
                matriz[ancho-i-1][capa]=matriz[ancho-i][capa]; //Columna izqda
            }
            matriz[capa+1][ancho-capa-1]=sq1;
            matriz[ancho-capa-1][ancho-capa-2]=sq2;
            matriz[ancho-capa-2][capa]=sq3;
            matriz[capa][capa+1]=sq4;
        }
        System.out.println();
        for(int i = 0; i < ancho; i++){
            for(int j=0; j < ancho; j++)
                System.out.printf("%3d ",matriz[i][j]);
            System.out.println();
        }
    }
}