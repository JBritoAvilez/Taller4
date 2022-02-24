package excerse5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * En esta clase se llamara los metodos de las otras clases en la cual se 
 * permitira crear instancia de ellas
 * @author jonatthan Brito
 * @version 01-01-01 2022-02-24
 */
public class Excerse5 {
    /**
     * En este metodo se recibe las opciones que desea el usuario y dependiendo de 
     * ella se creara el vehiculo deseado
     * @param option contiene la opcion del usuario
     * @param vehicleList  contiene la informacion del arreglo vehiculo
     */
 public static void createdVehicle(int option, List vehicleList) {
        switch (option) {

            case 1 -> {

                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int numberOfDoors = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));
                
                int s = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de tripulantes"));
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de ruedas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Card a = new Card(numberPassengers, powerCard, numberSeats, wheels, name, name);
                
                a.isCrew(numberPassengers);

                vehicleList.add(a);
                break;

            }


            case 2 -> {
                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle truck1 = new Truck(numberPassengers, powerCard, numberSeats, wheels, name);
                
                truck1.isCrew(numberPassengers);

                vehicleList.add(truck1);
                break;
            }
            
            case 3 ->{
                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle motorcycle1 = new MotorCycle(numberPassengers, powerCard, numberSeats, wheels, name);

                motorcycle1.isCrew(numberPassengers);

                vehicleList.add(motorcycle1);
                break;
            }
            
            case 4 -> {
            
                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle bike1 = new Bike(numberPassengers, powerCard, numberSeats, wheels, name, 26);

                bike1.isCrew(numberPassengers);

                vehicleList.add(bike1);
                break;
            }
            
            case 5-> {
                System.out.println("vehicleList = " + vehicleList.toString());
                break;
            }
            default -> {
                System.out.println("termino");
            }

        }
    }

    public static void main(String[] args) {
        /**
         * se crea un arreglo el cual almacenera la informacion de los vehiculos
         */
        List vehicleList = new ArrayList();
        int option = 0;
        
        /**
         * En este cilo se vera el menu del usuario
         */
        while (option < 6) {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Que tipo de vehiculo quiere crear: 
                                                                  1- Crear un carro
                                                                  2- crear un camion
                                                                  3- crear una moto
                                                                  4- crear una bicicleta
                                                                  5- mostrar mis autos
                                                                  6- salir"""));
            if (option < 6) {
                createdVehicle(option, vehicleList);
            }

        }
    }
}

