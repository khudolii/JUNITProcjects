/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.Arrays;
import java.util.HashMap;

public class Palindrom {
    
    public boolean[] isPal(String[] arr) {
        
        boolean[] ret = new boolean[arr.length];
        int rett = 0;
        String pattern = "[a-zA-Z]+";
        
        HashMap<String, Boolean> map = new HashMap<>();
        
        String[] res = new String[arr.length];
        for(int i = 0; i<res.length; i++)
            res[i] = "";
        int j = 0;
        for (String arr1 : arr) {
            char[] c = arr1.toCharArray();
            for(int i = 0; i<c.length; i++)
            {
                String a = ""+c[i];
                if(a.matches(pattern))
                    res[j]+=c[i];
            }
            //System.out.println(res[j]);
            j++;
        }
         int cou = 0;
        for(String res1 : res)
        {
            char[] c = res1.toLowerCase().toCharArray();
            int mid = c.length/2;
            boolean check = true;
            for(int beg = 0, end = c.length-1, m = 0; m<=mid; beg++, end--, m++)
            {
                if(c[beg]!=c[end])
                {
                    map.put(arr[cou], false);
                    ret[rett] = false;
                    rett++;
                    check = false;
                    break;
                }
                
            }
            if(check)
            {
                map.put(arr[cou], check);
                ret[rett] = true;
                rett++;
            }
            cou++;
            
        }
        
        System.out.println(map);
        return ret;
        
    }
}
