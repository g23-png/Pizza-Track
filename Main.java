import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n===== PIZZA TRACK =====");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre pizza: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrediente 1: ");
                    String ing1 = scanner.nextLine();

                    System.out.print("Ingrediente 2: ");
                    String ing2 = scanner.nextLine();

                    System.out.print("Ingrediente 3: ");
                    String ing3 = scanner.nextLine();

                    Pizza pizza = new Pizza(nombre, ing1, ing2, ing3);

                    gestion.registrarPizza(pizza);

                    break;

                case 2:

                    gestion.deshacer();

                    break;

                case 3:

                    gestion.rehacer();

                    break;

                case 4:

                    gestion.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("Saliendo...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}