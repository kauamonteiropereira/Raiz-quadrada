import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for (int numero = 1; numero <= 100; numero++) {
            double raiz = Math.sqrt(numero);
            System.out.println("Número " + numero + " - Raiz Quadrada " + raiz);
        }
    }
}