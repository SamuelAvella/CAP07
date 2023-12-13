import java.util.Scanner;
public class EjTipoExamen {
    public static void pintarTablero (){ 
        int filas = 11;
        int columnas = 11;
        char [][]matriz = new char[filas][columnas];
        System.out.println("* * * * * * * * * * * * *");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("* ");
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 5 && j == 5)
                    System.out.print("M ");
                else {
                    matriz[i][j]=' ';
                    System.out.print(matriz[i][j]+" ");
                }
            }
            System.out.println("*");
        }
        System.out.println("* * * * * * * * * * * * *");
    }
    public static char menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a. Izquierda");
        System.out.println("d. Derecha");
        System.out.println("s. Abajo");
        System.out.println("w. Arriba");
        System.out.println("p. Pintar");
        System.out.println("b. Borrar");
        System.out.println("m. Mover");
        System.out.println("r. Rotar sentido antihorario");
        System.out.println("e. Espejo horizontal");
        System.out.println("l. Limpiar tablero");
        System.out.println("q. salir");
        char opcion = sc.next().charAt(0);
        opcion = Character.toLowerCase((char)opcion);
        sc.close();
        return opcion;
    }
    public static int moverM (char opcion){
        opcion = menu();
        switch (opcion) {
            case 'a': 
                
                break;
        
            default:
                break;
        }
        return 1;
    }
    public static void main(String[] args) {
        pintarTablero();
        menu();
        
    }
}
