import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Introoduccion breve
        Scanner sc = new Scanner(System.in);
        int camino = 0;
        System.out.println("Bienvenido a la Libercontingencia.");


        // El siguiente try catch es un temporizador para que el codigo vaya un poco mas despacio cuando lo ponga
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------");
        System.out.println("               _||_               ");
        System.out.println("              ||  ||              ");
        System.out.println("----------------------------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tienes que elegir en cada momento la opción que consideres\ncorrecta indicando el numero de la opcion que quieres");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lo has entendido?");

        boolean opcion = false;

        // Primera eleccion
        while (opcion == false) {

            System.out.println("----------------");

            System.out.println("1. SI");
            System.out.println("2. NO");
            if (sc.hasNextInt()) {
                camino = sc.nextInt();}else  {
                sc.nextLine();
            }
                if (camino != 1 && camino != 2) {
                    System.out.println("Elige un numero entre los anteriores");
                } else {
                    opcion = true;

                }
                switch (camino) {

                    case 1:

                        System.out.println("Perfecto, podemos empezar...");
                        try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        opcion = true;
                        break;

                    case 2:


                        System.out.println("Pues lo acabas de hacer...\nPodriamos empezar ya pero por si acaso, elige si quieres empezar.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        opcion = false
                        ;
                        break;
                }

        }


        System.out.println("Estas en un bosque oscuro por la noche, no sabes como has llegado aqui pero la cuestion es que estas, \nno sabes si estas solo o si hay peligros cerca,\ncontigo tienes una mochila con una linterna, una pistola de bengalas\ny un cuchillo\n \n");
        System.out.println("La idea es sobrevivir hasta conseguir salir, Por donde empezarias?");

        //Segunda eleccion
        opcion = false;
        camino = 0;
        while (opcion == false) {

            System.out.println("----------------");

            System.out.println("1. No me lo pienso, tiro la bengala y epspero que alguien me ayude");
            System.out.println("2. Cuchillo y linterna en mano y avanzamos con cuidado a ver que encuentro");
            System.out.println("3. Paseo nocturno por un bosque desconocido, que puede salir mal?");
            if (sc.hasNextInt()) {
                camino = sc.nextInt();}else  {
                sc.nextLine();
            }
            if (camino != 1 && camino != 2 && camino != 3) {
                System.out.println("Elige un numero entre los anteriores");
            } else {
                opcion = true;

            }
            switch (camino) {

                case 1:

                    System.out.println("Has muerto\nLa bengala la vio un lobo...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    opcion = true;
                    break;

                case 2:


                    System.out.println("Parece que vamos bien, de momento todo fluye, vas tenso pero seguro de ti mismo");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    //Primera bifurcacion


                    System.out.println("TE ACABAN DE ATACAR POR LA ESPALDA QUE HACES");

                    boolean flag = false;
                    while (flag == false) {
                        System.out.println("----------------");

                        System.out.println("1. Coges el cuchillo y te defiendes como puedes");
                        System.out.println("2. Intentas calmar la situación con palabras");
                        if (sc.hasNextInt()) {
                            camino = sc.nextInt();}else  {
                            sc.nextLine();
                        }
                        if (camino != 1 && camino != 2) {
                            System.out.println("Elige un numero entre los anteriores");
                        } else {
                            flag = true;

                        }
                        switch (camino) {

                            case 1:

                                System.out.println("Genial...");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Era tu mejor amigo, no veia nada y te atacó por miedo de ver a alguien con cuchillo, ahora no le veras nunca mas.");

                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                System.out.println("Sigues tu camino y llegas a una casa a oscuras,\nya casi estas fuera del bosque, la casa es el limite,\nparece que estaban celebrando un cumple\n la linterna se queda sin pilas.");
                                System.out.println("Que haces");
                                boolean flag2 = false;
                                while (flag2 == false) {
                                    System.out.println("----------------");

                                    System.out.println("1. Entras en la casa");
                                    System.out.println("2. La rodeas y sales a la calle principal");
                                    if (sc.hasNextInt()) {
                                        camino = sc.nextInt();}else  {
                                        sc.nextLine();
                                    }
                                    if (camino != 1 && camino != 2) {
                                        System.out.println("Elige un numero entre los anteriores");
                                    } else {
                                        flag2 = true;

                                    }

                                    switch (camino) {

                                        case 1:
                                            System.out.println("Entras y descubres que estan todos tus amigos, era una fiesta sorpresa para tu cumple\npero no salió como esperaban y ahora eres un asesino.");
                                            System.out.println("Has ido a la carcel porque has confesado y te han detenido, fin del juego");
                                            flag2 = true;
                                            break;

                                        case 2:

                                            System.out.println("Rodeas la casa y te vas a la calle principal.\nSigues caminando y llega una patrulla de policias que te detienen por asesinato.\nFin del juego.");

                                            flag2 = true;
                                            break;
                                    }
                                }


                                opcion = true;
                                break;

                            case 2:


                                System.out.println("Te han matado, no se sentia seguro con alguien con un cuchillo, te lo ha quitado y te lo ha clavado.");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                flag = true;
                                break;
                        }

                    }


                    opcion = true;
                    break;





                case 3:
                    System.out.println("Todo bien, de momento, a lo mejor habria sido\nbuena idea coger la linterna");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Primera bifurcacion
                    System.out.println("TE ACABAN DE ATACAR POR LA ESPALDA QUE HACES");

                    flag = false;
                    while (flag == false) {
                        System.out.println("----------------");

                        System.out.println("1. te asustas y corres.");
                        System.out.println("2. Intentas calmar la situación a ver si el tipo se calma.");
                        if (sc.hasNextInt()) {
                            camino = sc.nextInt();
                        } else {
                            sc.nextLine();
                        }
                        if (camino != 1 && camino != 2) {
                            System.out.println("Elige un numero entre los anteriores");
                        } else {
                            flag = true;
                        }

                        switch (camino) {

                            case 1:

                                System.out.println("has ido demasiado rapido, has hecho mucho ruido y te persiguen los lobos,\nya sabes como has acabado...");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                flag = true;
                                break;

                            case 2:


                                System.out.println("Genial!!!\n era tu mejor amigo, te va a acompañar en tu viaje.");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                System.out.println("Sigues el camino con tu mejor amigo y de repente aparece un lobo");
                                boolean flag2 = false;
                                while (flag2 == false) {
                                    System.out.println("----------------");

                                    System.out.println("1. Le deslumbras con la linterna");
                                    System.out.println("2. Le lanzas el cuchillo");
                                    if (sc.hasNextInt()) {
                                        camino = sc.nextInt();}else  {
                                        sc.nextLine();
                                    }
                                    if (camino != 1 && camino != 2) {
                                        System.out.println("Elige un numero entre los anteriores");
                                    } else {
                                        flag2 = true;

                                    }

                                    switch (camino) {

                                    case 1:
                                        System.out.println("Despues de darle con la linterna se ha asustado y se ha ido corriendo, ha habido suerte\nPor otra parte la linterna se ha quedado sin bateria");

                                        try {
                                            Thread.sleep(2000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.println("Llegas a una casa y resulta que te estan esperando todos tus amigos\nte han hecho una fiesta sorpresa por tu cumple, Ha sido la mejor fiesta de tu vida.");
                                        System.out.println("Fin del juego.");

                                        flag2 = true;
                                        break;

                                    case 2:

                                        System.out.println("Le has alcanzado con el cuchillo y se lo has clavado, se ha enfadado y os a matado, fin del juego.");

                                        flag2 = true;
                                        break;

                                    }
                                }
                                flag = true
                                ;
                                break;
                        }
                    }


                    opcion = true;
                    break;

            }

        }
    }
}