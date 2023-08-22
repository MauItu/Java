import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de juegos ganados por el jugador A: ");
        int juegosA = sc.nextInt();

        System.out.println("Ingrese el número de juegos ganados por el jugador B: ");
        int juegosB = sc.nextInt();
        if (juegosB >= 0 && juegosB >= 0) {
            if (juegosA <= 7 && juegosB <= 7) {
                if (juegosA == 6 && juegosA - juegosB >= 2) {
                    System.out.println("El jugador A ganó el set.");
                } else if (juegosB == 6 && juegosB - juegosA >= 2) {
                    System.out.println("El jugador B ganó el set.");
                } else if (juegosB == juegosA) {
                    System.out.println("El set todavía no termina.");
                } else if (juegosA == 7 && juegosB == 6) {
                    System.out.println("El jugador A ganó el set.");
                } else if (juegosB == 7 && juegosA == 6) {
                    System.out.println("El jugador B ganó el set.");
                } else {
                    System.out.println("El resultado es inválido.");
                }
            } else {
                System.out.println("Resultado invalido");
            }

        } else {
            System.out.println("Resultado invalido");


        }
    }
}
