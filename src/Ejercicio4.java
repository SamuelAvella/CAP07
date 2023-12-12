public class Ejercicio4 {
    public static void main(String[] args) {
        int numero [] = new int [20];
        int cuadrado [] = new int [20];
        int cubo [] = new int [20];
        for (int i = 0; i < 20; i++) {
            numero [i] = (int)(Math.random()*101);
            cuadrado [i] = (int)Math.pow(numero[i], 2);
            cubo [i] = (int)Math.pow(numero[i], 3);
        }
        System.out.println("| numero | cuadrado |  cubo    |");
        for (int i = 0; i < 20; i++) {
            System.out.printf("| %6d │ %8d │ %8d |\n", numero[i], cuadrado[i], cubo[i]);
        }     
    }
}
