import java.util.Scanner;
 
public class AlgoritmaEuclidean {
	public static void main(String[] args) {
		int a, b, r;
		Scanner x = new Scanner(System.in);
		System.out.println("Masukkan nilai a : ");
		a = x.nextInt();
		System.out.println("Masukkan nilai b : ");
		b = x.nextInt();
		System.out.println();
		r = a % b;
		while ( r != 0 ) {
			a = b;
			b = r;
			r = a%b;
		}
		System.out.println("FPB = " + b);
	}
}