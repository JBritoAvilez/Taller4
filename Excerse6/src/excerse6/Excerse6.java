package excerse6;
/**
 * Importaciones de clase vector y file
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Se crea esta clase para ejecutar el metodo creado en ella misma el cual
 * permita la creacion de un archivo plano y asi agregarle los datos
 * @author jonathan Brito
 * @version 01-01-01 2022-02-23
 */
public class Excerse6 {
/**
 * este metodo fue creado para obtener un archivo plano
 * @param archivo referencia del archivo
 * 
 */
    public static void openFile(File archivo){
        try{
            System.out.println("Se ha ingresado dos numeros similares consecutivamente");
            Desktop.getDesktop().open(archivo);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        /**
         * instancia del vector
         */
        Vector<String> number = new Vector();
        String num=JOptionPane.showInputDialog("Digite el numero que desea ingresar");
        
        /**
         * se validadra los numeros,si el numero que fue ingresado por el usuario es 
         * repetido este se detentra
         */
        while(!number.contains(num)){
            number.addElement(num);
            System.out.println("Numero = "+number);
            num = JOptionPane.showInputDialog("Digite el numero que desea ingresar");
        }
        
        /**
         * creacion y escritura de los ficheros
         */
        File file=new File("fichero.txt");
         try (PrintWriter writeNumbers = new PrintWriter(file)) {
            writeNumbers.write(number.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
        openFile(file);
    }
}