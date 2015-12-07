package NewtonCalc;

/**
 *
 * @author sl3252
 */
public class Planet {
    
    private double g = 0;
    private double massBase = 0;
    private int massPow = 0;
    private double mass = 0;
    private double radius = 0;    
    private double orbitVel = 0;
    private double escVel = 0;
    private double gForce = 0;
    
    public Planet(double g, double massBase, int massPow, double mass, double radius) {
        this.g = g;
        this.massBase = massBase;
        this.massPow = massPow;
        this.mass = mass;
        this.radius = radius;
    }
    
    public Planet(double massBase, int massPow, double g, double radius, 
    double orbitVel, double escVel, double gForce) {
        this.massBase = massBase;
        this.massPow = massPow;
        this.mass = (Math.round(massBase * 100.0) / 100.0) * Math.pow(10, massPow);
        this.g = g;
        this.radius = radius;
        this.orbitVel = orbitVel;
        this.escVel = escVel;
        this.gForce = gForce;
    }
    
    public double getMassBase() {
        return massBase;
    }
    
    public int getMassPow() {
        return massPow;
    }
    
    public double getMass() {
        return mass;
    }
    
    public double getG() {
        return g;
    }
    
    public double getRadius() {
        return radius;
    }
        
    public double getOrbitVel() {
        return orbitVel;
    }
    
    public double getEscVel() {
        return escVel;
    }
    
    public double getGForce() {
        return gForce;
    }
    
    public void setG(double newg) {
        this.g = newg;
    }
    
    public void setMass(double newmass) {
        this.mass = newmass;
    }
    
    public void setRadius(double newradius) {
        this.radius = newradius;
    }
    
    public void setOrbitVel(double neworbitvel) {
        this.orbitVel = neworbitvel;
    }
    
    public void setEscVel(double newescvel) {
        this.escVel = newescvel;
    }
    
    public void setGForce(double newgforce) {
        this.gForce = newgforce;
    }
    
    public void calcOrbitVel(double g, double mass, double radius) {     
        double orbitVelRaw = Math.sqrt((g * mass) / (radius * 1000));
        double orbitVelRounded = (Math.round(orbitVelRaw * 100.0)) / 100.0;
        
        setOrbitVel(orbitVelRounded);
    }
    
    public void calcEscVel(double g, double mass, double radius) {
        double escVelRaw = Math.sqrt((2 * g * mass) / (radius * 1000));
        double escVelRounded = (Math.round(escVelRaw * 100.0)) / 100.0;
        
        setEscVel(escVelRounded);
    }
    
    public void calcGForce(double g, double mass, double radius) {       
        double gForceRaw = (g * mass) / (Math.pow((radius * 1000), 2));
        double gForceRounded = (Math.round(gForceRaw * 100.0)) / 100.0;
        
        setGForce(gForceRounded);
    }
}
