/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;
 
public class Temperature extends ElectricalAppliance {
    
    private double square = 0.0; //площадь помещения
    
    public Temperature(){}
    
    public Temperature(double voltage, double current, double square)
    {
        super(voltage, current);
        this.square = square;
    }
    
    public double power_empty() //мощность для пустого помещения с учетом окон
    {
        return square/10.;
    }
    

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Temperature{" + "square=" + square + '}';
    }
    
    public double getSquare(){return square;}
    public void setSquare(double square){this.square = square;}
    
}
