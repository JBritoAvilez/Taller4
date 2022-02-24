package excerse5;

/**
 *
 * @author jonatthan Brito
 */
public class Truck  extends Vehicle{

    /**
     * constructor
     * @param NPassengers
     * @param power
     * @param numberOfSeats
     * @param numberOfWheels
     * @param crew
     * @param name 
     */
    public Truck(int NPassengers, int power, int numberOfSeats, int numberOfWheels, String crew, String name) {
        super(NPassengers, power, numberOfSeats, numberOfWheels, crew, name);
    }

    Truck(int numberPassengers, int powerCard, int numberSeats, int wheels, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * metodo creado para obtener la velocidad del vehiculo
     * @param power potencia de la bicicleta
     */
    @Override
    public void speed(int power) {
        this.power = power + 50;
    }
    
}
