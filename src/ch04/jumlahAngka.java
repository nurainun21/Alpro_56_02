public class jumlahAngka {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("Jumlah angka dengan angka setelah yang bernilai genap : ");
		for ( int i = 0; i<data.length-1; i++ ) {
			int x = data[i] + data[i+1];
			boolean a = (x % 2 == 0);
				if (a) {
					System.out.println(x);
				}
		}
	}
}