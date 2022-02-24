package excerse1;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * En esta clase se declararan los metodos y atributos
 * que seran heredados en otras clases
 * @version 01-01-01 2022-02-23
 * @author Jonathan Brito
 * @since 01
 */
public class Excerse1 {
    /**
     * En este metodo tiene el fin de preguntar al usuario que actividad
     * desea realizar 
     * @param SolarSystem 
     */
   public static void menu(List SolarSystem){
       try{
           int option = 0;
           int select = 0;
           
           while(option <2 || select ==9){
               option = Integer.parseInt(JOptionPane.showInputDialog("1) caulcular la fuerza Gravitacional\n"+"2) salir"));
               select = 0;
               
               if(option == 1){
                select = Integer.parseInt(JOptionPane.showInputDialog("1- Tierra con respecto al Sol\n" + 
                                                                      "2- Marte con respecto al Sol\n" + 
                                                                      "3- Mercurio con respecto al Sol\n" + 
                                                                      "4- Jupiter con respecto al Sol\n" +
                                                                      "5- Saturno con respecto al Sol\n" +
                                                                      "6- Venus con respecto al Sol\n" + 
                                                                      "7- Urano con respecto al Sol\n" + 
                                                                      "8- Neptuno con respecto al Sol\n" +
                                                                      "9- volver al menu principal"));
               }
               if(option <2){
                  Planets.calculation(select, SolarSystem);
               }
           }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Debe ingresar en numero la opcion a elegir "+e);
            menu(SolarSystem);
        }
   } 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * intancia de la clase Planeta y crear un arreglo en el cual
         * contendra la informacion de los planetas
         */
        List<Planets> planetary = new ArrayList();

        
        //nombre,masa kg,densidad km3,diametro km,DistanciaSol MKm
        Planets planetMercury = new Planets("Mercurio",(float) 3.302, (float) 5.43,(float) 4879.4,(float) 57.91);
        Planets planetVenus = new Planets("Venus",(float) 4.869,(float) 5.24,(float) 12103.6,(float) 108.2);
        Planets planetEarth = new Planets("Tierra",(float) 5.9736,(float) 1.08321,(float) 5.515,(float) 149.6);
        Planets planetMars = new Planets("Marte",(float) 6.4185,(float) 3.9335,(float) 6794.4,(float) 227.9);
        Planets planetJupiter = new Planets("Jupiter",(float) 1.899,(float) 1336,(float) 142984,(float)778.5);
        Planets planetSaturn = new Planets("Saturno",(float)5.688,(float) 690,(float) 12536,(float) 1.434);
        Planets planetUrano = new Planets("Urano",(float)8.686,(float) 1.274,(float) 51.118,(float) 2.871);
        Planets planetNeptune = new Planets("Neptuno",(float)1.024,(float)1.64,(float)49.572,(float) 4.495);
        
        planetary.add(planetMercury);
        planetary.add(planetVenus);
        planetary.add(planetEarth);
        planetary.add(planetMars);
        planetary.add(planetJupiter);
        planetary.add(planetSaturn);
        planetary.add(planetUrano);
        planetary.add(planetNeptune);
        
        menu(planetary);
    }
    
}
