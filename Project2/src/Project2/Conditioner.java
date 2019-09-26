/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;


public class Conditioner extends Temperature {
    
    private int people = 0; //сколько людей живут в помещении
    private int tech = 0; //сколько единиц техники в помещении
    
    public Conditioner(){}
    
    public Conditioner(double voltage, double current, double square, int people, int tech)
    {
        super(voltage, current,square);
        this.people = people;
        this.tech = tech;
    }
    
    public boolean suitable() //соответствует ли мощность кондиционера площади помещения
    {
        return (super.power()>(super.power_empty()+people*0.1+tech*0.2));
    }
    
    
    public double getPeople(){return people;}
    public void setPeople(int people)
    {
        this.people = people;
    }
    
    public double getTech(){return tech;}
    public void setTech(int tech)
    {
        this.tech = tech;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Conditioner{" + "people=" + people + ", tech=" + tech + '}';
    }
    
    
    
}
