
package collections;


public class ParaulesHashSet implements Comparable <ParaulesHashSet> {

    public String palabras;
    public int idpalabra;
    
 
    //<editor-fold defaultstate="collapsed" desc="constructor">
    
    public ParaulesHashSet(int idpalabra, String palabras){
    this.idpalabra=idpalabra;    
    this.palabras=palabras;
    }
    
//</editor-fold>

    

    @Override
    public int compareTo(ParaulesHashSet o) {
      return this.palabras.compareTo(o.palabras);
    }
      
    

   
    
}
