package ashwin.manur.APCSA.hw.Chapter12;

public class DistanceTest {
	public static void main(String[] args){
		MyPlace p1 = new MyPlace(17);
		MyPlace p2 = new MyPlace(17);
		MyPlace p3 = new MyPlace(17);
		System.out.println(new DistanceTest().sameDistance(p1, p2, p3));

	}
	public boolean sameDistance(Place p1, Place p2, Place p3){
		return p1.distance(p2) == p1.distance(p3);
	}
}
