public class Valida {
    public int compra(Datos [] mercancia,int agregar,int cantidad,int [] disponibles){

        Datos elegido = mercancia[agregar-1];
        int costo = elegido.getPrecio() * cantidad;

        if(disponibles[agregar-1]>=cantidad){
            return costo;
        }else System.out.println("No hay suficientes productos");
        return 0;
    }

    public int[] agregados(Datos [] mercancia,int agregar,int cantidad,int [] disponibles){
        Datos elegido = mercancia[agregar-1];

        System.out.println(elegido.nombre + " fue agregado al carrito");
        System.out.println(agregar-1);
        disponibles [agregar-1] = 6;
        System.out.println("Disponibles " + disponibles[agregar-1]);
        return disponibles;
    }
}
