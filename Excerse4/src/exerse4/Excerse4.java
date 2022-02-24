package exerse4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * En esta clase se llamara los metodos de la clase vehiculo en la cual se creara una 
 * instancia de las clases 
 * 
 * @author jonathan Brito
 * @version 01-01-01 2022-02-23
 */
public class Excerse4 {
 /**
  * Metodo creado con el fin de recorre el arreglo y obtener los dato del mismo
  * @param option contiene la opcion elegida por el usuario
  * @param list contiene el enuevo arreglo 
  */
    public static void createFerry(int option, List list) {
        switch (option) {

            case 1 -> {
                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros en el ferry"));

                int powerFerry = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del ferry"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del ferry"));

                String name = JOptionPane.showInputDialog("ingrese el nombre del ferry");

                Vehicle f1 = new Vehicle(numberPassengers, powerFerry, numberSeats, name);

                f1.speed(powerFerry);
                f1.isCrew(numberPassengers);

                list.add(f1);

            }

            case 2 -> {
                System.out.println("\n" + list.toString());
            }
            default -> {
                System.out.println("termino");
            }

        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * En este metodo fue creado con el fin de que el usuario
     * elija las opciones presentadas 
     */
      List listFerrys = new ArrayList();
        int option = 0;
        while (option < 3) {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Elija una opcion: 
                                                                  1- Crear un Ferry
                                                                  2- mostrar mi flota de Ferrys
                                                                  3- salir"""));
            if (option < 3) {
                createFerry(option, listFerrys);
            }

        }

    }
  
    }
   
