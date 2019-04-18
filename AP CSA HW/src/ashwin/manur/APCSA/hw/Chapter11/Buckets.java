package ashwin.manur.APCSA.hw.Chapter11;
import java.util.*;

public class Buckets {
	public static ArrayList<ArrayList<String>> alphaBucket(List<String> words){
		String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
		ArrayList<ArrayList<String>> bucketCollection = new ArrayList<ArrayList<String>>();
		
		for(int buckNum = 0; buckNum < 26; buckNum++) {
			ArrayList<String> buck = new ArrayList<String>();
			bucketCollection.add(buck);
		}
		
		for(int wordNum = 0; wordNum < words.size(); wordNum++) {
			String currentWord = words.get(wordNum);
			for(int letterCount = 0; letterCount < alphabet.length(); letterCount += 2) {
				if(currentWord.charAt(0) == alphabet.charAt(letterCount) || currentWord.charAt(0) == alphabet.charAt(letterCount + 1)) {
					(bucketCollection.get(letterCount / 2)).add(currentWord);
					break;
				}
			}

		}
		return bucketCollection;
	}
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList(new String[] {"ash", "b", "cat", "eat", "deal", "dog", "hat", "art", "field", "far", "bat", "beep", "ale", "z", "meep","gasdf", "vedi"});
		System.out.println(alphaBucket(words));
	}
}
