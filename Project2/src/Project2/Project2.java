/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

public class Project2 {
    public static void main(String[]args)
    {
        Parallelogram par1 = new Parallelogram(4,6,12);
        System.out.println("Par1 perimeter ="+par1.perimeter());
        System.out.println("Par1 square ="+par1.square());
        
        Object o = new Object();
        
        if(o instanceof Parallelepiped)
        {
            Parallelepiped parp1 = (Parallelepiped)o;
            System.out.println("Parp1 perimeter ="+parp1.perimeter());
            System.out.println("Parp1 square ="+parp1.square());
            System.out.println("Parp1 volume ="+parp1.volume());
        } 
        else
        {
            System.out.println("Unknown object type");
        }
        
        
        
    }
}
