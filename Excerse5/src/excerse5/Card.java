package excerse5;

/**
 *
 * @author jonatthan Brito
 */
public class Card extends Vehicle{
   /**
    * atributos
    */
    protected int numberOfDoors;
    
/**
 * constructor
 * @param NPassengers
 * @param power
 * @param numberOfSeats
 * @param numberOfWheels
 * @param crew
 * @param name 
 */
    public Card(int NPassengers, int power, int numberOfSeats, int numberOfWheels, String crew, String name) {
        super(NPassengers, power, numberOfSeats, numberOfWheels, crew, name);
        this. numberOfDoors = numberOfDoors;
    }
    
        public Card() {
        super();
        this.numberOfDoors = 0;
    }
        
    /**
     * metodo creado para obtener la velocidad del vehiculo
     * @param power potencia de la bicicleta
     */
    @Override
    public void speed(int power) {
        this.power= power + 150;
    }
    
}
