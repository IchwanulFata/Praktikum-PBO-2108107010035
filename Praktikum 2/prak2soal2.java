import java.util.Scanner;

public class prak2soal2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.println("Masukkan Nilai mahasiswa : ");
        nilai = input.nextInt();

        if (nilai >= 87){
            System.out.println("Nilai Huruf : A");
            System.out.println("Indeks Prestasi : 4.00");
        }else if(nilai < 87 && nilai >= 78){
            System.out.println("Nilai Huruf : AB");
            System.out.println("Indeks Prestasi : 3.50");
        }else if(nilai < 78 && nilai >= 69){
            System.out.println("Nilai Huruf : B");
            System.out.println("Indeks Prestasi : 3.00");
        }else if(nilai < 69 && nilai >= 60){
            System.out.println("Nilai Huruf : BC");
            System.out.println("Indeks Prestasi : 2.50");
        }else if(nilai < 60 && nilai >= 51){
            System.out.println("Nilai Huruf : C");
            System.out.println("Indeks Prestasi : 2.00");
        }else if(nilai < 51 && nilai >= 41){
            System.out.println("Nilai Huruf : D");
            System.out.println("Indeks Prestasi : 1.50");
        }else if(nilai < 41 && nilai >= 0){
            System.out.println("Nilai Huruf : E");
            System.out.println("Indeks Prestasi : 1.00");
        }else {
            System.out.println("Inputan salah, mohon masukkan nilai dari range 1 s/d 100");
        }

    }
}