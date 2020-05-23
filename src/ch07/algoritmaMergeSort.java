public class algoritmaMergeSort {
	static int[] data ;
	public static void main(String[] args) {
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("Data sebelum diurutkan : ");
		data = array;
		tampilkan(data);
		int[] wadah = new int[array.length];
		System.out.println("Data setelah diurutkan : ");
		rekursifms(wadah,0, data.length-1);
		tampilkan(data);
	}
	public static void rekursifms(int[] arr, int kiri, int kanan) {
		if(kiri<kanan) {
			int tengah = (kiri+kanan) / 2;
			rekursifms(arr, kiri, tengah);
			rekursifms(arr, tengah+1, kanan);
			merge_sort(arr, kiri, tengah+1, kanan);
		}
	}
	
	public static void merge_sort(int[] proses, int halus, int besar, int Boundbesar) {
		int j=0;
		int Boundhalus = halus;
		int mid = besar-1;
		int n = Boundbesar - Boundhalus + 1;
		while (halus<=mid && besar <= Boundbesar) {
			if(data[halus]<data[besar]) {
				proses [j++] = data[halus++];
			} else {
				proses [j++] = data[besar++];
			}
		}
		while (halus<=mid) {
			proses [j++] = data[halus++];
		}
		while (besar<=Boundbesar) {
			proses [j++] = data[besar++];
		}
			
		for ( j = 0; j<n; j++) {
			data[Boundhalus + j] = proses[j];
		}
	}
	
	static void tampilkan (int[]arr) {
		for (int i = 0; i<arr.length; i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}