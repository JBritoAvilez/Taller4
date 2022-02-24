package excerse5;

/**
 *
 * @author jonatthan Brito
 */
public class Bike extends Vehicle{
    /**
     * atributos
     */
    protected int rhine;
    
    /**
     * constructor
     * @param NPassengers
     * @param power
     * @param numberOfSeats
     * @param numberOfWheels
     * @param crew
     * @param name
     * @param rhine 
     */
    public Bike(int NPassengers, int power, int numberOfSeats, int numberOfWheels, String crew, String name,int rhine) {
        super(NPassengers, power, numberOfSeats, numberOfWheels, crew, name);
        this.rhine = rhine;
    }

    public Bike() {
        super();
        this.rhine = 0;
    }

    Bike(int numberPassengers, int powerCard, int numberSeats, int wheels, String name, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * metodo creado para obtener la velocidad del vehiculo
     * @param power potencia de la bicicleta
     */
    @Override
    public void speed(int power) {
        this.power = power +1;
    }
    
}
