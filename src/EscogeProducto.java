import java.util.Scanner;

public class EscogeProducto {
    public int compra(Scanner scanner){
        Llena llena = new Llena();
        Muestra muestra = new Muestra();
        Valida valida = new Valida();

        int agregar = 0,cantidad = 0,comprado = 0;
        int [] cant = new int[3];
        Datos [] mercancia = llena.datos();

        cant = llena.cantidad1();
        muestra.productos(mercancia,cant);
        agregar = muestra.agregar(scanner);
        cantidad = muestra.cantidad(scanner);
        comprado = valida.compra(mercancia,agregar,cantidad,cant);


        return comprado;
    }
}
