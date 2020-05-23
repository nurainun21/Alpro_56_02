import java.util.Vector;
 
public class SieveofEratosthenes {
 
    public static void main(String[] args) {
        int limit = 200; 
        boolean[] bil_asal = new boolean[limit];
        for (int i = 0; i < limit; i++) {
            bil_asal[i] = true;
        }
        bil_asal[0] = false;
        bil_asal[1] = false; 
 
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (bil_asal[i]) {
                for (int j = i * i; j < limit; j = j + i) {
                    bil_asal[j] = false;
                }
            }
        }
 
        Vector<Integer> prima = new Vector<Integer>();
        for (int i = 2; i < limit; i++) {
            if (bil_asal[i]) {
                prima.add(i);
            }
        }
        System.out.println("Jumlah bilangan prima antara 0 sampai " + limit
                + " adalah " + prima.size() + " buah");
		System.out.println(prima);
    }
}