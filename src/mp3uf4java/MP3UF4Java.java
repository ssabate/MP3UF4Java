/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3uf4java;

/**
 *
 * @author profe
 */
public class MP3UF4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b1=new Bicycle(), b2=new Bicycle();
        
        Bicycle[] dosBicis={b1, b2, b2};
        
        System.out.println(dosBicis[0].cadence);
        
        String[][] descuadrada={{"1.1"},{"2.1","2.2"}};
        
        for(int i=0;i<descuadrada.length;i++)
            for(int j=0;j<descuadrada[i].length;j++)
                System.out.println(descuadrada[i][j]);    
    }
    
}
