public class Ejemplo1 {
    public final int VACIO = 0;
    public final int MINA = 1;
    public final int TESORO = 2;
    public final int INTENTO = 3;
    public static void creaCuadrante (int filas, int columnas) {
        return new int (filas)
    }
    public static void inicializa (int [][] cuadrante){
        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
    }
    public static void dibujaCuadrante (int [][] cuadrante){
        for( int y = 3; y >= 0; y--) {
            System.out.print(y + "|");
            for(int x = 0; x < 5; x++) {
                if (cuadrante[x][y] == INTENTO) {
                    System.out.print("X ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static int obtenerCoordenadasAleatorias (int filas, int columnas){
        int coordenadas new 
        coordenadas[0] = (int)(Math.random()*filas);
        coordenadas[1] = (int)(Math.random()*columnas);
    }

    public static void main(String[] args) {
        // se definen constantes para representar el
        // contenido de las celdas
        
        int x;
        int y;
        int[][] cuadrante = creaCuadrante(x, y);;
        // inicializa el array
        
        // coloca la mina
        int coordenadas []= obtenerCoordenadasAleatorias(null, x, y);
        int minaX = (int)(Math.random() * 5);
        int minaY = (int)(Math.random() * 4);
        cuadrante[minaX][minaY] = MINA;
        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;
        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
        // pinta el cuadrante
        dibujaCuadrante(cuadrante);
        System.out.println(" ----------\n 0 1 2 3 4\n");
        // pide las coordenadas
        System.out.print("Coordenada x: ");
        x = Integer.parseInt(System.console().readLine());
        System.out.print("Coordenada y: ");
        y = Integer.parseInt(System.console().readLine());
        // mira lo que hay en las coordenadas indicadas por el usuario
        switch(cuadrante[x][y]) {
            case VACIO:
                cuadrante[x][y] = INTENTO;
            break;
            case MINA:
                System.out.println("Lo siento, has perdido.");
                salir = true;
            break;
            case TESORO:
                System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                salir = true;
            break;
            default:
        }
        } while (!salir);
            // pinta el cuadrante
            for(y = 3; y >= 0; y--) {
                System.out.print(y + " ");
                for(x = 0; x < 5; x++) {
                    switch(cuadrante[x][y]) {
                        case VACIO:
                            c = " ";
                        break;
                        case MINA:
                            c = "* ";
                        break;
                        case TESORO:
                            c = "€ ";
                        break;
                        case INTENTO:
                            c = "X ";
                        break;
                        default:
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
        System.out.println(" ----------\n 0 1 2 3 4\n");
    }
}
