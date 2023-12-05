import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Menerima input data pelanggan
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Masukkan nomor HP pelanggan: ");
            String nomorHP = scanner.nextLine();

            System.out.print("Masukkan alamat pelanggan: ");
            String alamat = scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan(namaPelanggan, nomorHP, alamat);

            // Menerima input data pembelian
            System.out.print("Masukkan kode barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan nama barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();

            System.out.print("Masukkan jumlah beli: ");
            int jumlahBeli = scanner.nextInt();

            Barang barang = new Barang(kodeBarang, namaBarang, harga, jumlahBeli);

            String namaKasir = scanner.nextLine(); // mengambil input nama kasir

            StrukPembelian strukPembelian = new StrukPembelian(pelanggan, barang, namaKasir);

            // Menampilkan struk pembelian
            strukPembelian.tampilkanStruk();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Pastikan format input sesuai.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Tutup scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
