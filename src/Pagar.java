import java.util.Scanner;

public class Pagar {
    public void metodo(Scanner scanner,int total){
        Muestra muestra = new Muestra();

        int m = muestra.metodo(scanner);
        double IVA = total * 0.16;
        double totalConIVA = total + IVA;

        if(m==1){
            System.out.println("El precio total es $" + totalConIVA);
        }else {
            if(total<800){
                double comision = total * 0.5;
                double  comisioIVA = comision + totalConIVA;
                System.out.println("El costo total mas la comision es de $" + comisioIVA);
            }else {
                System.out.println("El precio total es $" + totalConIVA);
            }
        }
    }
}
