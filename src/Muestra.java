import java.util.Scanner;

public class Muestra {
    public void productos(Datos [] productos,int [] cant){
        Llena llena = new Llena();
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Id: " + (i+1));
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Precio: $" + productos[i].getPrecio());
            System.out.println("Cantidad: " + cant[i]);
            System.out.println("--------------------------------------------------------------");
        }
    }

    public int  agregar(Scanner scanner){
        System.out.println("Ingresa el Id del producto que quieres agregar: ");
        return scanner.nextInt();
    }

    public int cantidad(Scanner scanner){
        System.out.println("Ingresa la cantidad: ");
        return scanner.nextInt();
    }

    public int metodo(Scanner scanner){
        System.out.println("Deseas pagar en efectivo (1) o con Tarjeta (2): ");
        return scanner.nextInt();
    }
}
