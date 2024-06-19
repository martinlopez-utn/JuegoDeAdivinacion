import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numAleatorio = new Random().nextInt(2);

        for (int i = 4; i >= 0; i--) {

            Scanner datoUser = new Scanner(System.in);
            System.out.println("Ingresa un numero entre 0 y 1");
            int intento = datoUser.nextInt();

            if (numAleatorio==intento){
                System.out.println("Acertaste");
                break;
            } else if (numAleatorio>intento){
                System.out.println("El numero es mayor, intentos restantes: " + i);
            } else {
                System.out.println("El numero es menor, intentos restantes: " + i);
            }
        }
    }
}