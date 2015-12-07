/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewtonCalc;
/**
 *
 * @author sl3252
 */
public class Universe {
    
    // these finals are set in the constructor only and never changed afterwards.
    private final Ball ball; 
    private final Planet planet; 
    
    public Universe (double initVel, double g, double massBase, int massPow, double mass, double radius) {
        ball = new Ball(initVel);
        planet = new Planet(g, massBase, massPow, mass, radius);
        
        planet.calcOrbitVel(g, mass, radius);
        planet.calcEscVel(g, mass, radius);
        planet.calcGForce(g, mass, radius);
        ball.calcPathType(initVel, planet.getEscVel(), planet.getOrbitVel());
    }
    
    public Universe(double initVel, double massBase, int massPow, double g, 
    double radius, double orbitVel, double escVel, double gForce, String pathType) {
        ball = new Ball(initVel, pathType);
        planet = new Planet(massBase, massPow, g, radius, orbitVel, escVel, gForce);
    }
    
    public Planet getPlanet() {
        return this.planet;
    }
    
    public Ball getBall() {
        return this.ball;
    }
    
    public StringBuffer toStringBuffer() {
        StringBuffer sb = new StringBuffer();
        
        sb.append("Initial Velocity: ").append(this.getBall().getInitVel()).append("m/s; ")
            .append("Mass: ").append(this.getPlanet().getMassBase()).append(" E")
            .append(this.getPlanet().getMassPow()).append("kg; ")
            .append("G: ").append(this.getPlanet().getG()).append("N⋅m2/kg2; ")
            .append("Radius: ").append(this.getPlanet().getRadius()).append("km; \n")
            .append("Orbital V: ").append(this.getPlanet().getOrbitVel()).append("m/s; ")
            .append("Escape V: ").append(this.getPlanet().getEscVel()).append("m/s; ")
            .append("G Force: ").append(this.getPlanet().getGForce()).append("N; ")
            .append("Path Type: ").append(this.getBall().getPathType()).append("\n\n");
        
        return sb;
    }
    
    @Override
    public String toString() {
        String s = this.toStringBuffer().toString();
        return s;
    }
}
