public class cariAngka {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}; 
		int cari = 20;
		System.out.println("Angka " + cari);
		for (int i=0; i<data.length; i++) {
			if (data[i] == cari) {
				System.out.println("Ada dalam Array");
			} else {
				System.out.println("Tidak ada dalam Array");
			}
		}
	}
}	