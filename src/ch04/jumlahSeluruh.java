public class jumlahSeluruh {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int jumlah = 0;
		
		for (int i = 0; i<data.length; i++) {
			System.out.println("Hasil jumlah " + data[i] + " dengan seluruh angka sebelumnya = ");
			System.out.println(data[i] + jumlah);
			jumlah = jumlah + data[i];
		}
	}
}