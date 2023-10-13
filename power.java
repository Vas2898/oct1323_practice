public class Mathdemo {

	public static void main(String[] args) {
		Mathdemo mathobj = new Mathdemo();
		mathobj.po(5, 5);
		
	}
	private void po(int a, int b) {
		int p = 1;
		int d = 1;
		while (d <= b) {
			p = p * a;
			d += 1;	
		}
		
		System.out.println(p);
	}
	
}
