
public class SodaCan {
	
	    public static final double DEFAULT_RADIUS = 1.2109;
	    public static final double DEFAULT_HEIGHT = 4.704;
	    public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
	    
	    private double radius;
	    private double height;
	    private double volume;
	
	 
	

    public SodaCan() {
    	this.radius = DEFAULT_RADIUS;
    	this.height = DEFAULT_HEIGHT;
    	this.volume = Math.PI * (radius * radius) * height * FLUID_OUNCES_PER_CUBIC_INCHES;
    	
    }
    
    public void SodaCan(double radius, double height) {
    	this.radius = radius;
    	this.height = height;
    	this.volume = Math.PI * (radius * radius) * height * FLUID_OUNCES_PER_CUBIC_INCHES;
    }
    
    public double getRadius() {
    	return radius;
    }

    public double getHeight() {
    	return height;
    }
    
    public double getVolume() {
    	return volume;
    }
    
    public void drink(double fluidOunces) {
    	this.volume = volume - fluidOunces;
    }
    
   
    }
}
