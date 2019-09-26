/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;
    
    
import java.util.HashMap;

public class Generics {

    Generics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @param args the command line arguments
     */
    public String count (String arg) {
        // TODO code application logic here
        String pattern = "[a-zA-Z]+";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: arg.toCharArray())
        {
            String s1 = ""+c;
            char low, high;
            if(s1.matches(pattern))
            {
                if((int)c<=90)
                {
                    int i = (int)c+32;
                    low = (char)i; 
                    high = c;
                }
                else
                {
                    int i = (int)c-32;
                    high = (char)i;
                    low = c;
                }
                if(map.containsKey(low)||map.containsKey(high))
                    map.put(low,map.get(low)+1);
                else
                    map.put(low,1);
            }
        }
        
        System.out.println(map);
        return map.toString();
    }
    
}
