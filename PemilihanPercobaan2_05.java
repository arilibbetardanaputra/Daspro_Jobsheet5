import java.util.Scanner;

public class PemilihanPercobaan2_05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Nilai uas      : ");
        float uas = input05.nextFloat();
        System.out.print("Nilai uts      : ");
        float uts = input05.nextFloat();
        System.out.print("Nilai kuis     : ");
        float kuis = input05.nextFloat();
        System.out.print("Nilai tugas    : ");
        float tugas = input05.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        System.out.println("Nilai akhir = " + total);

        if(total >= 81){
            System.out.println("Anda mendapat nilai A ");
        }
        else if(total >= 74){
            System.out.println("Anda mendapat nilai B+ ");
        }
        else if(total >= 66){
            System.out.println("Anda mendapat nilai B ");
        }
        else if(total >= 61){
            System.out.println("Anda mendapat nilai C+ ");
        }
        else if(total >= 51){
            System.out.println("Anda mendapat nilai C ");
        }
        else if(total >= 38){
            System.out.println("Anda mendapat nilai D ");
        }
        else if(total >= 0){
            System.out.println("Anda mendapat nilai E ");
        }
    }
}