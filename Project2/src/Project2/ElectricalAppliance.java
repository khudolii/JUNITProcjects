/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;


public class ElectricalAppliance { //класс "электроприбор"
    
    private double voltage = 0.0; //напряжение
    private double current = 0.0; //потребимая мощность
    
    public ElectricalAppliance(){}
    
    public ElectricalAppliance(double voltage, double current)
    {
        this.voltage = voltage;
        this.current = current;
    }
    
    public double power() //узнать ток прибора
    {
        return current*voltage;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" + "voltage=" + voltage + ", current=" + current + '}';
    }

    
    
    public final double getVoltage(){return voltage;}
    public void setVoltage(double voltage)
    {
        this.voltage = voltage;
    }
    
    public final double getCurrent(){return current;}
    public void setCurrent(double current)
    {
        this.current = current;
    }
    
    
}
