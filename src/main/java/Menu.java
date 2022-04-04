import java.util.Scanner;

/***
 * La clase Menu lo que hará es crear dos métodos uno para imprimir las opciones y así mismo lo que decida el usuario,
 * y otro para ejecutar un ciclo en caso de que el usuario quiera elegir otro planeta.
 * @author Daniel Mauricio Naranjo Benavides - naranjobenavidesd@gmail.com
 */
public class Menu {
    /***
     * Este método se encarga de ejecutar el programa cuantas veces quiera el usuario.
     */
    public void repeatOption(){
        Scanner repeat = new Scanner(System.in);
        Menu menuIteraction = new Menu();
        Integer decisionPerson1;
        do {
            menuIteraction.menu();
            System.out.println("\nSi desea elegir otro planeta ponga un 1 de lo contrario ponga un 2");
            Integer decisionPerson = repeat.nextInt();
            decisionPerson1 = decisionPerson;
        }while (decisionPerson1 == 1);
    }

    /***
     * Este método lo que hace es imprimir las opciones y según lo que elija el usuario eso mismo imprimir.
     */
    public void menu(){
        Scanner answer = new Scanner(System.in);

        System.out.println("Seleccione un planeta \n");

        System.out.println("1: Mercurio. \n2: Venus. \n3: Tierra. \n4: Marte. \n5: Júpiter. \n" +
                "6: Saturno. \n7: Urano.  \n8: Neptuno. \n");

        Integer answerPerson = answer.nextInt();

        FatherPlanetarySystem optionPlanet;

        switch (answerPerson) {
            case 1 -> {
                optionPlanet = new Planet("Mercurio", 3.285E23, 5.43, 4874.4,
                                            3.7, 58000000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 2 -> {
                optionPlanet = new Planet("Venus", 4.867E24, 5.24, 12104.0,
                                            8.87, 108200000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 3 -> {
                optionPlanet = new Planet("Tierra", 5.972E24, 5.51, 12742.0,
                                            9.807, 149600000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 4 -> {
                optionPlanet = new Planet("Marte", 6.39E23, 3.93, 6779.0,
                                            3389.5, 227900000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 5 -> {
                optionPlanet = new Planet("Júpiter", 1.899E27, 1.33, 139820.0,
                                            24.79, 778500000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 6 -> {
                optionPlanet = new Planet("Saturno", 5.683E29, 687.0, 116460.0,
                                            10.44, 1434000000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 7 -> {
                optionPlanet = new Planet("Urano", 8.681E28, 1.27, 50724.0,
                                            8.87, 2871000000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            case 8 -> {
                optionPlanet = new Planet("Neptuno", 1.021E29, 1.64, 49244.0,
                                            11.15, 4495000000.0);
                System.out.println(optionPlanet.toString());
                optionPlanet.gravitationalPull();
            }
            default -> System.out.println("La opción es incorrecta");
        }
    }
}
