/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Raman Haivaronski
 */
public class Cone implements the3D{
    private double height;
    private double slantHeight;
    private double radius;
    private double area;
    private double volume;
    
    @Override
    public double getHeight(){
        return height;
    }
    public void setHeight(double x){
        this.height = x;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getSlantHeight(){
        return slantHeight;
    }
    public void setSlantHeight(double x){
        this.slantHeight = x;
    }
    
    @Override
    public double getArea(){
        return area = Math.PI * getRadius() * getRadius() + Math.PI * getRadius() * getSlantHeight();
    }
    @Override
    public double getVolume(){
        return volume = (Math.PI*getRadius()*getRadius()*getHeight())/3;
    }
}
