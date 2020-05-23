import java.util.Scanner;

public class bilanganPembagi {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Masukkan bilangan = ");
		int bil = x.nextInt();
		System.out.println("Bilangan pembagi : ");
		for ( int i = 3; i<bil; i++ ) {
			if (bil % i == 0) {
				System.out.println(i);
			}
		}
	}
}	