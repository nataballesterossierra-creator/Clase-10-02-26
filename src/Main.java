import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Clase - objeto - Instancia */

        Scanner teclado = new Scanner(System.in);

        /* Primera Forma */
        Vehiculo v1 = new Vehiculo();
        v1.setModelo("Mazda");
        v1.setNumMotor("abc123");
        v1.setSerial("abc123456789");
        System.out.println(v1.toString());

        v1.arrancar();
        System.out.println(v1.frenar());
        System.out.println(" Estoy tanqueando "+ v1.tanquear());
        System.out.println("Estoy Retanqueado "+v1.retanquear(28));
        /* Segunda Forma */
        Vehiculo v2 = new Vehiculo("Toyota", "XYZ907", "XYZ987123465");
        System.out.println(v2.toString());
        v2.arrancar();
        System.out.println(v2.frenar());
        System.out.println(" Estoy tanqueando "+ v2.tanquear());
        System.out.println(" Estoy Retanqueado "+v2.retanquear(16));

      //
        /* Tercera Forma*/
         Vehiculo v3 = new Vehiculo();
        System.out.println(" Ingrese el nombre del modelo del vehiculo");
        v3.setModelo(teclado.next());
        System.out.println(" Ingrese el modelo del carro ");
        v3.setSerial(teclado.next());
        System.out.println(" Ingrese el modelo del carro ");
        v3.setNumMotor(teclado.next());
        System.out.println(v3.toString());









    }
}