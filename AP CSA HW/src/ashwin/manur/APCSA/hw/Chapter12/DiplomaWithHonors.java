package ashwin.manur.APCSA.hw.Chapter12;

public class DiplomaWithHonors extends Diploma{
	
	public DiplomaWithHonors(String name, String degree) {
		super(name, degree);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n*** with honors ***";
	}
}
