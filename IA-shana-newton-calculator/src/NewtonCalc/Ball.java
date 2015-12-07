package NewtonCalc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sl3252
 */
public class Ball {
    
    private double initVel = 0;
    private String pathType = "";
    
    public Ball(double initVel) {
        this.initVel = initVel;
    }
    
    public Ball(double initVel, String pathType) {
        this.initVel = initVel;
        this.pathType = pathType;
    }
    
    public String getPathType() {
        return pathType;
    }
    
    public double getInitVel() {
        return initVel;
    }
    
    public void setPathType(String newPathType) {
        this.pathType = newPathType;
    }
    
    public void setInitVel(double newInitVel) {
        this.initVel = newInitVel;
    }
    
    public void calcPathType(double initVel, double escVel, double orbitVel) {
        String path = "";
        
        if(initVel < escVel && initVel >= orbitVel) {
            path = "Orbit";
        } 
        else if (initVel < orbitVel) {
            path = "Fall Back";
        } 
        else if (initVel >= escVel) {
            path = "Escape";
        }
        
        setPathType(path);
    }
}
