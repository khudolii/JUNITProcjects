/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static List<Double> comparingDoubles(int prec) throws FileNotFoundException, IOException {
        List<Double> res = new ArrayList<>();
        // TODO code application logic here
        try{
        
        Scanner sc = new Scanner(new File("D:\\input.txt"));
        List<Double> list = new ArrayList<>();
        while(sc.hasNextDouble())
        {
            list.add(sc.nextDouble());
            
        }
        sc.close();
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("D:\\output.txt"),false));

        List<Double> list1 = new ArrayList<>();
        
        for(int i = 0; i<list.size(); i++)
        {
            double d = list.get(i);
            d = Math.round(d*Math.pow(10.0,prec*1.)*1.)/Math.pow(10.0,prec*1.)*1.;
            list1.add(d);
        }
       for(int i = 0; i<list1.size(); i++)
        {
            for(int k = 0; k<list1.size(); k++)
            {
                if(Double.compare(list1.get(i),list1.get(k))!=0&&
                        Double.compare(Math.abs(list1.get(i)),Math.abs(list1.get(k)))==0&&i!=k&&i<k)
                {
                    pw.print(list.get(i));
                    res.add(list.get(i));
                    res.add(list.get(k));
                    pw.write(" ");
                    pw.print(list.get(k));
                    pw.println();
                }
            }
        }
        pw.close();
        }
        catch (FileNotFoundException e)
	{
            System.out.println("Sorry, File not found!");
	}
        catch(IOException ex)
        {
            System.out.println("Sorry, error rewriting!");
        }
        return res;
    }
    
}
