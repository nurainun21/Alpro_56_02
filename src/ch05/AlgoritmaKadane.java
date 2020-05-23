public class AlgoritmaKadane {
	public static void main(String[] args) {
		int[] data = {-2, -3, 5, -1, -2, 1, 9, -3, -8, 11};
		int start = 0;
		int end = 0;
		int maxSum = 0, sum = 0;
        int i;
        for(i = 0; i < data.length; i++) {
            sum = sum + data[i];
            if(sum < 0) { 
				sum = 0; 
				start = i + 1; 
			} else if (sum > maxSum) {
                maxSum = sum;
                end = i;
            }
        }
		
        System.out.print("Elemen dengan Max Sum : ");
        for(i = start; i <= end; i++) {
            System.out.print(data[i] + " ");
		}
		System.out.print(" and Max Sum is " + maxSum);
    }
}	