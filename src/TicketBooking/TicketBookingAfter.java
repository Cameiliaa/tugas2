package TicketBooking;

import java.util.Scanner;

/**
 * Kelas TicketBookingAfter menyediakan aplikasi pemesanan tiket sederhana
 * di mana pengguna dapat memasukkan detail mereka dan menghitung total harga tiket.
 */
public class TicketBookingAfter {
    /**
     * Metode utama yang menjalankan aplikasi.
     * Mengumpulkan input pengguna untuk detail pemesanan, membuat pemesanan, dan menampilkan total harga.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama Anda:");
        String namaPelanggan = scanner.nextLine();

        System.out.println("Masukkan tujuan Anda:");
        String tujuan = scanner.nextLine();

        System.out.println("Masukkan jumlah tiket:");
        int jumlahTiket = scanner.nextInt();

        System.out.println("Masukkan harga per tiket:");
        double hargaTiket = scanner.nextDouble();

        Pemesanan pemesanan = new Pemesanan(namaPelanggan, tujuan, jumlahTiket, hargaTiket);
        pemesanan.tampilkanDetailPemesanan();

        hitungTotalHarga(jumlahTiket, hargaTiket);
    }

    /**
     * Menghitung dan menampilkan total harga tiket berdasarkan jumlah tiket
     * dan harga per tiket.
     *
     * @param tiket jumlah tiket
     * @param harga harga per tiket
     */
    public static void hitungTotalHarga(int tiket, double harga) {
        System.out.println("Total harga: " + (tiket * harga));
    }
}

/**
 * Kelas Pemesanan mewakili pemesanan untuk pelanggan dengan detail seperti
 * nama pelanggan, tujuan, jumlah tiket, dan harga per tiket.
 */
class Pemesanan {
    private String nama;
    private String tujuan;
    private int jumlahTiket;
    private double hargaPerTiket;

    /**
     * Membuat instance Pemesanan dengan detail yang ditentukan.
     *
     * @param namaPelanggan  nama pelanggan
     * @param tujuan         tujuan pemesanan
     * @param jumlahTiket    jumlah tiket yang dipesan
     * @param hargaPerTiket  harga per tiket
     */
    public Pemesanan(String namaPelanggan, String tujuan, int jumlahTiket, double hargaPerTiket) {
        this.nama = namaPelanggan;
        this.tujuan = tujuan;
        this.jumlahTiket = jumlahTiket;
        this.hargaPerTiket = hargaPerTiket;
    }

    /**
     * Menampilkan detail pemesanan, termasuk nama pelanggan, tujuan,
     * dan jumlah tiket yang dipesan.
     */
    public void tampilkanDetailPemesanan() {
        System.out.println("Pemesanan berhasil untuk " + nama + " ke " + tujuan + " untuk " + jumlahTiket + " tiket.");
    }
}
