public class Mathdemo {

	public static void main(String[] args) {
		Mathdemo mathobj = new Mathdemo();
		mathobj.po(5, 0);
		
	}
	private void po(int a, int b) {
		int p = 1;
		while (b > 0) {
			p = p * a;
			b =b - 1;	
		}
		
		System.out.println(p);
	}
	
}
