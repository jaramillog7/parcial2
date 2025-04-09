import java.util.Scanner;

public class Ropita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precioCamiseta = 25000, precioPantalon = 45000, precioChaqueta = 65000;
        int cantidadCamisetas = 0, cantidadPantalones = 0, cantidadChaquetas = 0;
        int opcion;

        do {
            System.out.println("Elige algun producto :");
            System.out.println("1. Camisetas = $25000");
            System.out.println("2. Pantalones = $45000");
            System.out.println("3. Chaquetas = $65000");
            System.out.println("4. Salir");
            System.out.print("Si ya sabes que deseas comprar, digita una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("¿Cuántas camisetas deseas comprar? ");
                cantidadCamisetas = cantidadCamisetas + sc.nextInt();
            } else if (opcion == 2) {
                System.out.print("¿Cuántos pantalones deseas comprar? ");
                cantidadPantalones = cantidadPantalones + sc.nextInt();
            } else if (opcion == 3) {
                System.out.print("¿Cuántas chaquetas desea comprar? ");
                cantidadChaquetas = cantidadChaquetas + sc.nextInt();
            }

        } while (opcion != 4);
        double subtotalCamisetas = precioCamiseta * cantidadCamisetas;
        double ivaCamisetas = subtotalCamisetas * 0.19;
        double descuentoCamisetas = 0;

        if (cantidadCamisetas >= 3 && cantidadCamisetas <= 4) {
            descuentoCamisetas = subtotalCamisetas * 0.10;
        } else if (cantidadCamisetas > 4) {
            descuentoCamisetas = subtotalCamisetas * 0.15;
        }
        double totalCamisetas = subtotalCamisetas + ivaCamisetas - descuentoCamisetas;


        double subtotalPantalones = precioPantalon * cantidadPantalones;
        double ivaPantalones = subtotalPantalones * 0.19;
        double descuentoPantalones = 0;

        if (cantidadPantalones >= 3 && cantidadPantalones <= 4) {
            descuentoPantalones = subtotalPantalones * 0.10;
        } else if (cantidadPantalones > 4) {
            descuentoPantalones = subtotalPantalones * 0.15;
        }
        double totalPantalones = subtotalPantalones + ivaPantalones - descuentoPantalones;


        double subtotalChaquetas = precioChaqueta * cantidadChaquetas;
        double ivaChaquetas = subtotalChaquetas * 0.19;
        double descuentoChaquetas = 0;
        if (cantidadChaquetas >= 3 && cantidadChaquetas <= 4) {
            descuentoChaquetas = subtotalChaquetas * 0.10;
        } else if (cantidadChaquetas > 4) {
            descuentoChaquetas = subtotalChaquetas * 0.15;
        }
        double totalChaquetas = subtotalChaquetas + ivaChaquetas - descuentoChaquetas;


        double totalFinal = totalCamisetas + totalPantalones + totalChaquetas;

        System.out.println("El resumen de tu compra es:");

        System.out.println("El subtotal de las camisetas es: $" + (int)subtotalCamisetas);
        System.out.println("El IVA de las camisetas es: $" + (int)ivaCamisetas);
        System.out.println("El descuento de las camisetas es: $" + (int)descuentoCamisetas);
        System.out.println("El total de las camisetas es: $" + (int)totalCamisetas);


        System.out.println("El subtotal de los pantalones es: $" + (int)subtotalPantalones);
        System.out.println("El IVA de los pantalones es: $" + (int)ivaPantalones);
        System.out.println("El descuento de los pantalones es: $" + (int)descuentoPantalones);
        System.out.println("El total de los pantalones es: $" + (int)totalPantalones);
        
    
        System.out.println("El subtotal de las chaquetas es: $" + (int)subtotalChaquetas);
        System.out.println("El IVA de las chaquetas es: $" + (int)ivaChaquetas);
        System.out.println("El descuento de las chaquetas es: $" + (int)descuentoChaquetas);
        System.out.println("El total de las chaquetas es: $" + (int)totalChaquetas);

        System.out.println("Total a pagar: $" + (int)totalFinal);
    }
}