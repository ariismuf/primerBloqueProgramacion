import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Introoduccion breve
        System.out.println("Bienvenido a la Libercontingencia.");


        // El siguiente try catch es un temporizador para que el codigo vaya un poco mas despacio cuando lo ponga
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------");
        System.out.println("               _||_               ");
        System.out.println("              ||  ||              ");
        System.out.println("----------------------------------");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tienes que elegir en cada momento la opción que consideres\ncorrecta indicando el numero de la opcion que quieres");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lo has entendido?");

        boolean opcion = false;

        // Primera eleccion
        while (opcion == false) {

            System.out.println("----------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("1. SI");
            System.out.println("2. NO");
            int camino = sc.nextInt();
            if (camino != 1 && camino != 2) {
                System.out.println("Elige un numero entre los anteriores");
            }else{
                opcion = true;

            }
            switch (camino) {

                case 1:
                    System.out.println("Perfecto, podemos empezar...");
                    opcion = true;
                    break;

                case 2:
                    System.out.println("Pues lo acabas de hacer...\nPodriamos empezar ya pero por si acaso, elige si quieres empezar.");
                    opcion = false
                    ;
                    break;
            }
        }

        //Segunda eleccion
    }
}