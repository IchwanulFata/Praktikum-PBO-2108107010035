import java.util.Scanner;

public class hargaBarang {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		int jumlahBarang, hargaPerUnit, hargaTotal, jumlahHarga;
		
		System.out.print("Masukkan jumlah barang :");
		jumlahBarang = input.nextInt();
		
		System.out.print("Masukkan harga per unit :");
		hargaPerUnit = input.nextInt();
		
		hargaTotal = jumlahBarang * hargaPerUnit;
		jumlahHarga = hargaTotal - (15 * hargaTotal / 100);
		
		System.out.print("Harga setelah di diskon :"+jumlahHarga);
	}
}