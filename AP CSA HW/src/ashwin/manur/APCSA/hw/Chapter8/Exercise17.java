package ashwin.manur.APCSA.hw.Chapter8;

import java.util.Scanner;
public class Exercise17 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String name = kboard.nextLine();
		System.out.println(validFileName(name));
		kboard.close();
	}
	public static String validFileName(String file) {
		if(file == null || file.equals(""))
			return null;
		if(file.substring(0,1).equals("."))
			return null;
		if(file.indexOf(".") > 8)
			return null;
		if(file.indexOf(":") != -1 || file.indexOf("\\") != -1 || file.indexOf("?") != -1 || file.indexOf("*") != -1)
			return null;
		if(file.indexOf(".") != file.lastIndexOf("."))
			return null;
		if(file.indexOf(".") == -1)
			file += ".TXT";
		if(file.indexOf(".") == file.length() - 1)
			file = file.substring(0,file.indexOf('.'));
		return file.toUpperCase();
	}

}
