/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

public class Heater extends Temperature {
    
    public double t_inside = 0.0; //какая температура должна быть внутри
    public double t_outside = 0.0; //какая снаружи температура
    public double height = 0.0; //высота потолков в помещении
    public double k = 0.0; //коэффициент рассеивания тепла в помещении
    
    public Heater(){}
    
    public Heater(double voltage, double current, double square, 
            double t_inside, double t_outside, double height, double k)
    {
        super(voltage, current,square);
        this.t_inside = t_inside;
        this.t_outside = t_outside;
        this.height = height;
        this.k = k;
    }
    
    public boolean suitable() //соответствует ли мощность кондиционера площади помещения
    {
        double delta = (t_outside-t_inside)*-1.;
        return (super.power()>super.power_empty()&&super.power()>super.getSquare()*height*delta*k);
    }
    
    
    public double getT_Inside(){return t_inside;}
    public void setT_Inside(double t_inside)
    {
        this.t_inside = t_inside;
    }
    
   public double getT_Outside(){return t_outside;}
    public void setT_Outside(double t_outside)
    {
        this.t_outside = t_outside;
    }
    
    public double getHeight(){return height;}
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getK(){return k;}
    public void setK(double k)
    {
        this.k = k;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Heater{" + "t_inside=" + t_inside + ", t_outside=" + t_outside + ", height=" + height + ", k=" + k + '}';
    }
    
    
    
    
    
}
