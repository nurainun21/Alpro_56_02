import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a;
		int cek = 0;
        System.out.print("Masukkan angka: ");
        a = x.nextInt();
        for (int i = 2; i<=a; i++) {
            if(a%i==0) {
				cek++;
			}
		}
		
		if (cek == 1) {
            System.out.println(a + " adalah bilangan prima");
        } else {
            System.out.println(a + " bukan bilangan prima");
        }
	}
}