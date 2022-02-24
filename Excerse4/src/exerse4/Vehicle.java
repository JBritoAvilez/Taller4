package exerse4;

/**
 * En esta clase se declaran los atributos y metodos los cuales se le daran 
 * un comportamiento de manera en que cumplan con la funcion querida
 * 
 * @version  01-01-1 2022-02-23
 * @author jonatathan Birto
 * 
 */
public class Vehicle {
    /**
     * creacion de atributos
     */
    public int NPassengers;
    public int power;
    public int numberOfSeats;
    private String crew;
    String name;
/**
 * se crea Constructor
 * @param NPassengers
 * @param power
 * @param numberOfSeats
 * @param name 
 */
public Vehicle(int NPassengers, int power, int numberOfSeats, String name) {
        this.NPassengers = NPassengers;
        this.power = power;
        this.numberOfSeats = numberOfSeats;
        this.name = name;
    } 
/**
 * cracion de set y get de los atributos
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
     * creacion del metodo con el fin de saber la velocidad 
     * @param power potencia
     */
public void speed(int power) {
        this.power = power / 60;
    }

    /**
     * Creacion del metodo con el fin de saber si se encutran con tripulantes
     * en el cual depende si el numero de pasageros es mayor a 0
     * @param Npassengers numero de pasejeros
     */
public void isCrew(int Npassengers) {
        if (Npassengers > 0) {
            crew = "tripulado";
        } else {
            crew = "no tripulado";
        }
}
    /**
     * metodo en el cual se obtiene la informacion 
     * @return 
     */
public String toString() {
        return "Ferry: " + name + " pasajeros= " + NPassengers + ", velocidad = " + power + ", numero de asientos = " + numberOfSeats + ", tripulacion = " + crew + "\n";
    }
}
