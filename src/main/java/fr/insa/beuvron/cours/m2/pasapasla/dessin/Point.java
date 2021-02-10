/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.pasapasla.dessin;

/**
 *
 * @author francois
 */
public class Point {
    
    private double px;
    private double py;
    
    public Point() {
        this(0.0,0.0);
    }
    
     public Point(double px,double py) {
        this.px = px;
        this.py = py;
        System.out.println("coucou : init du point");
    }
    
    public double getPx() {
        return this.px;
    }
    
    public void setPx(double px) {
        this.px = px;
    }
    
    public double distance(Point p2) {
        double dx = this.px - p2.px;
        double dy = this.py - p2.py;
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public Point milieu(Point p2) {
        Point res;
        res = new Point();
        res.px = (this.px + p2.px)/2;
        res.py = (this.py + p2.py)/2;
        return res;
    }
    
    public String toString() {
        return "{Point ; abs : " + this.px + " ; ord : " + this.py + "}";
    }
    
    public static void testDistance() {
        Point p1,point2,pp,mi;
        p1 = new Point(0,0);
        point2 = new Point(1,2);
        pp = new Point(1,1);
        double dist = p1.distance(point2);
        double dist2 = pp.distance(p1);
        System.out.println("distance : " + dist);
        mi = p1.milieu(pp);
        System.out.println("milieu : " + mi);
    }
    
    public static void main(String[] args) {
        testDistance();
    }
    
}
