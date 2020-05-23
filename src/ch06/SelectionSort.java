public class SelectionSort {
	public static void main(String[] args) {
		int[] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		System.out.println("Hasil Pengurutan Data = ");
		for (int i = 0; i < data.length-1; i++) {
			int min = i;
			for (int j = i; j < data.length; j++) {
				if (data[j] < data[min]) {
					min = j;
				}
			}
			int baru = data[i];
			data[i] = data[min];
			data[min] = baru;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
} 