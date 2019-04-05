package ashwin.manur.APCSA.hw.Chapter9;
import java.util.Arrays;
public class Exercise19 {
	public static String[] allSubstrings(String str) {
		int n = str.length();
		int count = 0;
		String[] subStr = new String[n * (n + 1) / 2];
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j <= n; j++) {
				subStr[count] = str.substring(i, j);
				count++;
			}
		}
		return subStr;
	}
	public static String[][] manyWords(String[] words){
		String[][] subsLibrary = new String[words.length][];
		for(int rNum = 0; rNum < words.length; rNum++){
			subsLibrary[rNum] = allSubstrings(words[rNum]);
		}
		return subsLibrary;
	}
	public static void main(String[] args) {
		String cat = "elton";
		String[] catSubs = allSubstrings(cat);
		for(String ival : catSubs) {
			System.out.print(ival + ", ");
		}
		System.out.println();
		String[] words = {"cat", "dog", "rat"};
		String[][] wordsSubs = manyWords(words);
		for(String[] ival : wordsSubs) {
			System.out.println(Arrays.toString(ival));
		}
	}
}
