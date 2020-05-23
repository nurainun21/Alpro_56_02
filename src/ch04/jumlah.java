public class jumlah {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int jumlah = 0;
		for ( int i = 0; i<data.length; i++) {
			jumlah += data[i];
		}
		System.out.print("Jumlah angka didalam Array = " + jumlah);
		System.out.println();
	}
}	