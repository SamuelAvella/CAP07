public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        System.out.println("Introduce 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            numero [i] = Integer.parseInt(System.console().readLine());
            if (numero [i] < minimo)
                minimo = numero[i];
            if (numero [i] > maximo);
                maximo = numero[i];
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(numero [i]);
            if (numero [i] == minimo)
                System.out.println(" minimo");
            if (numero [i] == maximo)
                System.out.println(" maximo");
            else if(numero [i] != minimo && numero[i] != maximo)  
                System.out.println(1);
        }
    }
}
