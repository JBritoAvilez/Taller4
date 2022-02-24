package excerse1;

import java.util.List;
import javax.swing.JOptionPane;

/**
 * En esta clase se declararan los metodos y atributos
 * que seran heredados en otras clases
 * @version 01-01-01 2022-02-23
 * @author Jonathan Brito
 * @since 01
 */
public class Planets extends SolarSystem{
    /**
     * Constante usadas para hacer los calculos
     */
    private final double G = 6E-11;
    public static double massSun = 2E30;

    public Planets(String nombre, float masa, float densidad, float diametro, float distanciaSol) {
        super(nombre, masa, densidad, diametro, distanciaSol);
        
    }
/**
 * Se crea este metodo con el fin de calcular la fuerza gravitacional
 * de los dos planetas los cuales utilizaremos los parametros
 * @param mass 
 * @param Distance
 * @return F seria el resultado del calculo
 */
    @Override
    public float GravitationalForce(float mass, float Distance) {
        float F = (float) (G*(mass * massSun )/Distance);
        return F;
    }
    
    /**
     * Se crea este metodo con el fin de realizar el calculo de la fuerza 
     * gravitacional en el cual el usuario iligira gracias al switch 
     * 
     * @param select opcion tomada por el usuario
     * @param systemPlanets informacion de los planetas
     * @param SolarSystem 
     */
    public static void calculation(int select, List<Planets> SolarSystem){
        switch(select){
            case 1 -> {
                float gravity = SolarSystem.get(0).GravitationalForce
                        (SolarSystem.get(0).mass,SolarSystem.get(0).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 2 -> {
                float gravity = SolarSystem.get(1).GravitationalForce
                        (SolarSystem.get(1).mass,SolarSystem.get(1).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 3 -> {
                float gravity = SolarSystem.get(2).GravitationalForce
                        (SolarSystem.get(2).mass,SolarSystem.get(2).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 4 -> {
                float gravity = SolarSystem.get(3).GravitationalForce
                        (SolarSystem.get(3).mass,SolarSystem.get(3).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 5 -> {
                float gravity = SolarSystem.get(4).GravitationalForce
                        (SolarSystem.get(4).mass,SolarSystem.get(4).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 6 -> {
                float gravity = SolarSystem.get(5).GravitationalForce
                        (SolarSystem.get(5).mass,SolarSystem.get(5).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 7 -> {
                float gravity = SolarSystem.get(6).GravitationalForce
                        (SolarSystem.get(6).mass,SolarSystem.get(6).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
            case 8 -> {
                float gravity = SolarSystem.get(7).GravitationalForce
                        (SolarSystem.get(7).mass,SolarSystem.get(7).distanceSun);
                
                JOptionPane.showInputDialog(gravity + " N");
            }
        }
    }
    
}
