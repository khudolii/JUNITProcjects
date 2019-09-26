/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

public class Teapot extends ElectricalAppliance {
    
    private double volume = 0.0;
    
    public Teapot(){}
    
    public Teapot(double voltage, double current, double volume)
    {
        super(voltage, current);
        this.volume = volume;
    }
    
    public double time() //время за которое нагреется вода
    {
        return 0.00116*90*volume/super.power();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Teapot{" + "volume=" + volume + '}';
    }
    
    public double getVolume(){return volume;}
    public void setVolume(double volume)
    {
        this.volume = volume;
    }
    
    
    
}
