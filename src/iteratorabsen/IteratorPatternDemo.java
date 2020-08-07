/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorabsen;

/**
 *
 * @author Rival-PC
 */
public class IteratorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseSiswa databaseSiswa = new DatabaseSiswa();
        
        for(Iterator iter = databaseSiswa.getIterator(); iter.hasNext();){
            String nama = (String)iter.next();
            System.out.println("Nama : "+ nama);
        }
    }
    
}
