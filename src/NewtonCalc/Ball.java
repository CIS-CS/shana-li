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
    
    private static double initialVel = 0;
    private static String pathType = "";
    
    public Ball(double initVel) {
        calcPathType(initVel);
    }
    
    public static String getPathType() {
        return pathType;
    }
    
    public static double getInitialVel() {
        return initialVel;
    }
    
    private String calcPathType(double initVel) {
        String path = "";
        
        if(initVel < Planet.getEscVel() && initVel != Planet.getOrbitVel()){
            path = "Fall Back";
        } else if (initVel == Planet.getOrbitVel()) {
            path = "Orbit";
        } else if (initVel > Planet.getEscVel()){
            path = "Escape";
        }
        
        Ball.pathType = path;
        
        return path;
    }
}
