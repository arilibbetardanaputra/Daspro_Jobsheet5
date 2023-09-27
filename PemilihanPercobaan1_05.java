import java.util.Scanner;

public class PemilihanPercobaan1_05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        
        int angka = input05.hasNextInt() ? input05.nextInt() : -1;
        
        String jenisBilangan = (angka != -1) ? ((angka % 2 == 0) ? "genap" : "ganjil") : "Input yang Anda masukkan bukan angka.";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);
    }
}
