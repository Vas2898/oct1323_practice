public class Mathdemo {

	public static void main(String[] args) {
		Mathdemo obj = new Mathdemo();
		obj.find_floor(100.8);
		
	}

	private void find_floor(double no) {
		double div = no - (int)no;
		//System.out.println(div);
		if (div < .5) {
			System.out.println((int)no);
		}
		else {
			System.out.println((int)no + 1);
		}
		
	}
	
}
