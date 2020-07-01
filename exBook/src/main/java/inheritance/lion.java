package inheritance;

public class lion extends animal {
	
	
	
	
	public static void main (String[] args) {
		
		animal ani = new lion();
		ani.setType(3);
		ani.setHerbivore(false);
		ani.setNoise("raawwrr");
		ani.animalNoise(ani.getType());
		animalNoise(ani.getType(), ani.getNoise(), ani.isHerbivore());
		
	}
	
public static void animalNoise(int a, String b, boolean c ) {
	System.out.println("Animal: Lion Type: "+ a);
	System.out.println("Herbivore: " + c);
	System.out.println("Noise: "+b);
	
	
		
	}
	

}
