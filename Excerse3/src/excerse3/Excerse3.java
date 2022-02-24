package excerse3;

import javax.swing.JOptionPane;

/**
 * En esta clase se encontrara un arreglo en el cual se llenara aleatoriamente 
 * con numeros enteros en el cual el usuario tendras dos opciones para arreglar el
 * arreglo
 * 
 * @version 01-01-01 2022-02-23
 * @author jonatathan Brito
 * @since 01
 */
public class Excerse3 {
    /**
     * En este metodo le dara al usuario la opcion de elegir la creacion del arreglo
     * y los modos de los cuales los quiere arreglar los cuales serian por metodo de 
     * burbuja o QuickSort
     * 
     * @return 
     */
    public static int menu(){
        int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== CREACION DE ARREGLO ALEATORIO CON ENTEROS ===== \n\n"
                    + "1.Creacion de arreglo\n" 
                    + "2.Ordenar por metodo de Burbuja\n"
                    + "3.Ordenar por metodo de QuickSort\n"
                    + "4. Salir \n"
                    + "\n Seleccione una opción del 1 al 4\""));
            
        }while (opcion <=0 || opcion > 4);
                return opcion;
            
        
    }
    /**
     * Este metodo fue creado para desestructurar el arreglo, se asignara un pivote
     * para cada estructura derivada del arrelgo y validando los datos 
     * de manera constantemente si el numero seleccionado es mayor al siguiente 
     * y de esta manera se ordena, esta validacion se realiza con cada
     * subestructura hasta que se encuentre organizado el arreglo.
     * 
     * @param A contiene el arreglo de numeros
     * @param izq contiene el numero de la primera posicion
     * @param der contiene el numerode la ultima posicion
     */
    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[(izq+der)/2]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
  
  do{
            while(A[i] < pivote){
                i++;
            }
            while(A[j] > pivote){
                j--;
            }
            //aqui hacemos el intercambio
            if (i <= j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        }
            while(i <= j);
            
            if (izq < j ) {
                quicksort(A, izq, j);
            }
            else if (i < der) {
                quicksort(A, i, der);
            }
            else{
               for (int k = 0; k < A.length; k++){
                   System.out.println("numero ordenado por sort: " + A[k]);
               } 
            } 
   
}
    
    public static void main(String[] args) {
       /**
        * se crea el arreglo y los atributos aux y opcion utilizaremos el cilo do while
        * para asi poder asi se ejecute hasta  que el usario desee finalizar, utilizaremos
        * en el case 1 pondremos un ciclo for el cual cumplira la funcion de llenar el arreglo
        * y en el case 2 utilizaremos dos ciclos for para asi hacer el metodo de burbuja y asi 
        * organizar el vector
        */
        int enteros[]=new int[10];
        int aux,option; 
        
        do{
            option = menu();
            switch(option){
                case 1:
                    for(int i = 0;i<=9;i++){
                    enteros[i]=(int)(Math.random()*15+5);
                    System.out.println("Arreglo: "+i+" ---> "+enteros[i]);
                    }
                    break;  
                case 2:
                    for(int i = 0; i<10-1;i++){
                        for(int j=0;j<10-1;j++){
                            if(enteros[j]>enteros[j+1]){
                                aux=enteros[j];
                                enteros[j]= enteros[j+1];
                                enteros[j+1]=aux;
                            }
                        }
                    }
                    
                    for(int i = 0;i<10;i++){
                        System.out.println("Se a ordenado de la siguiente forma: "+enteros[i]);
                    }
                    break;
                case 3:
                    quicksort(enteros, 0, enteros.length-1);
                    break;
            }
        }while(option !=4);
        
    }
    
}