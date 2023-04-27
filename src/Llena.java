public class Llena {
    public Datos[] datos(){
        Datos [] productos = new Datos[3];
        productos[0] = new Datos("Galleta", 14);
        productos[1] = new Datos("Yogurt", 16);
        productos[2] = new Datos("Sabritas", 20);
        return productos;
    }

    public int [] cantidad1(){
        int [] disponible = new int[3];
        for (int i = 0; i < disponible.length; i++) {
            disponible[i] = 6;
        }
        return disponible;
    }

}
