import java.util.Scanner;

public class inventario_ufpso {
   
    public static void main(String[] args) {
        String[] names = new String[5];
        double[] precio = new double[5];
        int[] cantidad = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Ingresar nombres de productos
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": "); 
            names[i] = scanner.nextLine();
        }

        // Ingresar precios de productos
        for (int i = 0; i < precio.length; i++) {
            System.out.println("Ingrese el precio del producto " + names[i] + ": "); 
            precio[i] = scanner.nextDouble();
        }

        // Ingresar cantidades de productos
        for (int i = 0; i < cantidad.length; i++) {
            System.out.println("Ingrese la cantidad del producto " + names[i] + ": "); 
            cantidad[i] = scanner.nextInt();
        }

        // Menú para modificar valores
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Modificar nombre de un producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Modificar cantidad de un producto");
            System.out.println("4. Mostrar productos y precios totales");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el índice del producto a modificar (1-5): ");
                    int indexName = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese el nuevo nombre del producto: ");
                    names[indexName] = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese el índice del producto a modificar (1-5): ");
                    int indexPrecio = scanner.nextInt() - 1;
                    System.out.println("Ingrese el nuevo precio del producto: ");
                    precio[indexPrecio] = scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Ingrese el índice del producto a modificar (1-5): ");
                    int indexCantidad = scanner.nextInt() - 1;
                    System.out.println("Ingrese la nueva cantidad del producto: ");
                    cantidad[indexCantidad] = scanner.nextInt();
                    break;
                case 4:
                    for (int i = 0; i < names.length; i++) {
                        double total = precio[i] * cantidad[i];
                        System.out.println("El precio total del producto " + names[i] + " es: " + total);
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
