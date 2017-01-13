
package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tests {

    //<editor-fold defaultstate="collapsed" desc="menu">
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("Que vols fer? 1- ReverseOrder 2- LinkedList 3- paraules: ");
            int resposta = input.nextInt();
            
        switch (resposta){
        
        case 1:
            reverseorder();
            break;
        case 2:
            linkedlist();
            break;
        case 3:
            paraules();
            break;
    }
       
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="reverseorder">
     private static void reverseorder(){
         int i;
           Scanner input = new Scanner(System.in);
        ArrayList<String> personas = new ArrayList<>();
        
        System.out.printf("Cuantas personas quieres introducir? ");
                int numeropersonas = input.nextInt();
            
            for(i=0; i<numeropersonas; i++)
            {
                System.out.printf("Dime nombre de la %d ",i);
                    personas.add(input.next());
            }
            System.out.printf("Ordenació natural ArrayList %s %n", personas);
           Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(personas,comparador);
        System.out.printf("Ordenació inversa ArrayList: %s %n", personas);
        
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="linkedlist">
     private static void linkedlist(){
         Scanner input = new Scanner(System.in);
         int i;
         int N, Aleat;
         List<Integer> listalinked = new LinkedList<>();
          
           N = (int)(Math.random()*(20-10)+10);
           System.out.printf("Numero random entre 10-20 (posiciones): %d %n", N);
                  
                   for(i=0; i<N; i++){
                         Aleat = (int)(Math.random()*100);

                   }
           Collections.sort(listalinked);
           System.out.println(listalinked);
     }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="paraules">
     private static void paraules(){
      Scanner input = new Scanner(System.in);
      int i;
     
      Set<ParaulesHashSet> palabras = new HashSet<>();
      Iterator<ParaulesHashSet> iterator = palabras.iterator();    
      
      System.out.printf("Cuantas palabras vas a introducir : ");
      int resp = input.nextInt();
      int index=0;
      
      for(i=0; i<resp; i++){
          System.out.printf("%n Dime una palabra: ");
          String palabra = input.next();
          index=i;
           ParaulesHashSet p1 = new ParaulesHashSet (index,palabra);
           palabras.add(p1);
      }
      
      System.out.println("Palabras"+ palabras);
      
     /* ParaulesHashSet p1 = new ParaulesHashSet (1,"palabra1");
      ParaulesHashSet p2 = new ParaulesHashSet (2,"palabra2");
      ParaulesHashSet p3 = new ParaulesHashSet (3,"palabra3");
            palabras.add(p1);
            palabras.add(p2);
            palabras.add(p3);
     */
            while(iterator.hasNext()) {
                ParaulesHashSet s = iterator.next();
                 System.out.println(s);
            }
     }
//</editor-fold>
    
}
