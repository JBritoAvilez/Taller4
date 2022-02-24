package excerse5;

/**
 *
 * @author jonatthan Brito
 */
public abstract class Vehicle {
   /**
    * atributos
    */
    public int NPassengers,power,numberOfSeats,numberOfWheels;
    public String crew,name;

    /**
     * contructor
     * @param NPassengers
     * @param power
     * @param numberOfSeats
     * @param numberOfWheels
     * @param crew
     * @param name 
     */
    public Vehicle(int NPassengers, int power, int numberOfSeats, int numberOfWheels, String crew, String name) {
        this.NPassengers = NPassengers;
        this.power = power;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.crew = crew;
        this.name = name;
    }
    
        public Vehicle() {
        this.NPassengers = 0;
        this.power = 0;
        this.numberOfSeats = 0;
        this.numberOfWheels = 0;
        this.crew = "";
        this.name = "";
    }
    
/**
 * creacion de los set y get de los atributos
 * @return 
 */
    public int getNPassengers() {
        return NPassengers;
    }

    public void setNPassengers(int NPassengers) {
        this.NPassengers = NPassengers;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * metodo del cual cumplira la funcion de mostrar la informacion
     * @return 
     */
    public String toString(){
        return NPassengers + power + numberOfSeats + 
               numberOfWheels + crew + name;
    }
    
    /**
     * metodo creado para obtener la velocidad
     * @param power potencia
     */
    public abstract void speed(int power);
    
    /**
     * metodo creado para saber si se encutra tripulado o no el vehiculo
     * @param Npassengers numero de pasajeros 
     */
    public void isCrew(int Npassengers){
        if(Npassengers > 0) {
            crew = "tripulado";
        } else {
            crew = "no tripulado";
        }
    }
    
}