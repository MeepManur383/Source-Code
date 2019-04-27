package ashwin.manur.APCSA.hw.Chapter12;

public class Diploma {
	private String name;
	private String degree;
	
	public Diploma(String name, String degree) {
		this.degree = degree;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return("This certifies that " + name + "\nhas completed a MOOC in " + degree);
	}
}
