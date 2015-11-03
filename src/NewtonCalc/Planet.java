package NewtonCalc;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sl3252
 */
public class Planet {
    
    private static double orbitVel = 0;
    private static double escVel = 0;
    private static double gForce = 0;
    
    public static double getOrbitVel(){
        return orbitVel;
    }
    
    public static double getEscVel(){
        return escVel;
    }
    
    public static double getGForce(){
        return gForce;
    }
    
    public Planet(double g, double mass, double radius){
        calcOrbitVel(g, mass,radius);
        calcEscVel(g, mass, radius);
        calcGForce(g, mass, radius);
    }
    
    private double calcOrbitVel(double g, double mass, double radius){
        double orbitVelRaw = Math.sqrt((g*mass)/radius);
        double orbitVelRounded = (Math.round(orbitVelRaw * 100.0))/100.0;
        Planet.orbitVel = orbitVelRounded;
        return orbitVelRounded;
    }
    
    private double calcEscVel(double g, double mass, double radius){
        double escVelRaw = Math.sqrt((2*g*mass)/radius);
        double escVelRounded = (Math.round(escVelRaw * 100.0))/100.0;
        Planet.escVel = escVelRounded;
        return escVelRounded;
    }
    
    private double calcGForce(double g, double mass, double radius){
        double gForceRaw = (g*mass)/radius;
        double gForceRounded = (Math.round(gForceRaw * 100.0))/100.0;
        Planet.gForce = gForceRounded;
        return gForceRounded;
    }
    
}
