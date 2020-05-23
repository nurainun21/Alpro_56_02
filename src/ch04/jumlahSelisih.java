public class jumlahSelisih {
	public static void main(String[] args) {
		int[] selisih = {70, -29, 3, 19, -7, 17, -39, 28, -35, 47, -24, 29};
		int jumlah = 0;
		for ( int i = 0; i<selisih.length; i++) {
			jumlah += selisih[i];
		}
		System.out.print("Jumlah selisih pada poin(i) = " + jumlah);
		System.out.println();
	}
}