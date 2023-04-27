import java.util.Scanner;

public class Opciones {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Pagar pagar = new Pagar();
        EscogeProducto escogeProducto = new EscogeProducto();
        int x=0,comprado = 0,total = 0;

        while (x!=2){
            comprado = escogeProducto.compra(scanner);
            total += comprado;
            System.out.println("Continuar agregando (1) Proceder al pago (2)");
            x = scanner.nextInt();
        }
        System.out.println("El costo de los productos seleccionados es de $" + total);
        pagar.metodo(scanner,total);
    }
}
