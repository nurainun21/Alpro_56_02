public class besar {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("Angka-angka yang setelahnya bernilai lebih besar : ");
		for (int i = 0; i<data.length-1; i++) {
		boolean a = ( data[i+1] > data[i] );
			if (a) {
			System.out.println(data[i]);
			}
		}
	}
}	