package ashwin.manur.APCSA.hw.Chapter8;

public class Exercise13 {
	private String str;

	public Exercise13(String str) {
		this.str = str;
	}

	public boolean startsWith(String prefix) {
		if(str == null)
			return false;
		if(prefix.length() == 0)
			return false;
		if(str.length() == 0)
			return false;
		if(prefix == null || prefix.length() > str.length())
			return false;
		if(str.substring(0,prefix.length()).equals(prefix)) 
			return true;
		else
			return false;
	}

	public boolean endsWith(String suffix) {
		if(suffix.length() == 0)
			return false;
		if(str == null)
			return false;
		if(str.length() == 0)
			return false;
		if(suffix == null || suffix.length() > str.length())
			return false;
		if(str.substring(str.length() - suffix.length()).equals(suffix))
				return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		Exercise13 temp = new Exercise13("ashwin");
		System.out.println(temp);
		print(temp, "win");
		print(temp, "ash");
	}
	
	public static void print(Exercise13 temp, String checkMe) {
		System.out.println("Does " + temp + " start with " + checkMe + ": " + temp.startsWith(checkMe));
		System.out.println("Does " + temp + " end with " + checkMe + ": " + temp.endsWith(checkMe));		
	}

	
	@Override
	public String toString() {
		return str;
	}
}
