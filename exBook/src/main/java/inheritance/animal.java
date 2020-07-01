package inheritance;

public class animal {
	
	private int type;
	private String noise;
	private boolean herbivore;
	
	
	public animal(int type, String noise, boolean herbivore) {
		super();
		this.type = type;
		this.noise = noise;
		this.setHerbivore(herbivore);
	}
	
	public animal() {
		
	}
	
	public void animalNoise(int type){
		if (type == 4) {
			
		
		System.out.println("unknown animal noise");
		}
		else {
			System.out.println("known animal noise");
		}
		
		
		
	}
	public boolean chain(int type) {
		if(type>1 && type<4) {
			herbivore = false;
		
		}else {
			herbivore = true;
		}
		return herbivore;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getNoise() {
		return noise;
	}


	public void setNoise(String noise) {
		this.noise = noise;
	}

	public boolean isHerbivore() {
		return herbivore;
	}

	public void setHerbivore(boolean herbivore) {
		this.herbivore = herbivore;
	}
	
	
	
}
