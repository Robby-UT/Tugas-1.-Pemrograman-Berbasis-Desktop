//Nama  : Andi Robby Skaland Tenriwawo
//NIM   : 054819134
//Prodi : Sistem Informasi


// Kelas Menu untuk merepresentasikan item menu
class Menu {
    private String nama;
    private int harga;
    private String kategori;

    public Menu(String nama, int harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }
}

// Kelas utama
public class Main {
    // Array untuk menyimpan menu restoran
    private static Menu[] daftarMenu = {
            // Menu Makanan
            new Menu("Nasi Goreng", 25000, "Makanan"),
            new Menu("Nasi Padang", 30000, "Makanan"),
            new Menu("Mie Ayam", 20000, "Makanan"),
            new Menu("Soto Ayam", 22000, "Makanan"),

            // Menu Minuman
            new Menu("Es Teh", 5000, "Minuman"),
            new Menu("Es Jeruk", 7000, "Minuman"),
            new Menu("Jus Alpukat", 12000, "Minuman"),
            new Menu("Kopi", 10000, "Minuman")
    };

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("    SELAMAT DATANG DI RESTORAN NUSANTARA");
        System.out.println("==============================================\n");

        // Menampilkan daftar menu
        tampilkanMenu();

        // Simulasi pemesanan (tanpa input dari user, menggunakan data hardcode)
        // Contoh pesanan: Nasi Padang (2), Mie Ayam (1), Es Teh (3), Jus Alpukat (1)
        String[] namaPesanan = {"Nasi Padang", "Mie Ayam", "Es Teh", "Jus Alpukat"};
        int[] jumlahPesanan = {2, 1, 3, 1};

        System.out.println("\n==============================================");
        System.out.println("              PROSES PEMESANAN");
        System.out.println("==============================================");
        System.out.println("Pesanan:");
        System.out.println("1. Nasi Padang = 2");
        System.out.println("2. Mie Ayam = 1");
        System.out.println("3. Es Teh = 3");
        System.out.println("4. Jus Alpukat = 1");

        // Proses pemesanan dan cetak struk
        prosesStrukPembayaran(namaPesanan, jumlahPesanan);
    }

    // Method untuk menampilkan daftar menu dikelompokkan berdasarkan kategori
    private static void tampilkanMenu() {
        System.out.println("=============== DAFTAR MENU ==================\n");

        // Tampilkan menu kategori Makanan
        System.out.println(">>> MAKANAN <<<");
        System.out.println("----------------------------------------------");
        if (daftarMenu[0].getKategori().equals("Makanan")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[0].getNama(), daftarMenu[0].getHarga());
        }
        if (daftarMenu[1].getKategori().equals("Makanan")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[1].getNama(), daftarMenu[1].getHarga());
        }
        if (daftarMenu[2].getKategori().equals("Makanan")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[2].getNama(), daftarMenu[2].getHarga());
        }
        if (daftarMenu[3].getKategori().equals("Makanan")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[3].getNama(), daftarMenu[3].getHarga());
        }

        // Tampilkan menu kategori Minuman
        System.out.println("\n>>> MINUMAN <<<");
        System.out.println("----------------------------------------------");
        if (daftarMenu[4].getKategori().equals("Minuman")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[4].getNama(), daftarMenu[4].getHarga());
        }
        if (daftarMenu[5].getKategori().equals("Minuman")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[5].getNama(), daftarMenu[5].getHarga());
        }
        if (daftarMenu[6].getKategori().equals("Minuman")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[6].getNama(), daftarMenu[6].getHarga());
        }
        if (daftarMenu[7].getKategori().equals("Minuman")) {
            System.out.printf("%-20s : Rp %,d\n", daftarMenu[7].getNama(), daftarMenu[7].getHarga());
        }
        System.out.println("==============================================");
    }

    // Method untuk mencari menu berdasarkan nama
    private static Menu cariMenu(String nama) {
        if (daftarMenu[0].getNama().equals(nama)) {
            return daftarMenu[0];
        }
        if (daftarMenu[1].getNama().equals(nama)) {
            return daftarMenu[1];
        }
        if (daftarMenu[2].getNama().equals(nama)) {
            return daftarMenu[2];
        }
        if (daftarMenu[3].getNama().equals(nama)) {
            return daftarMenu[3];
        }
        if (daftarMenu[4].getNama().equals(nama)) {
            return daftarMenu[4];
        }
        if (daftarMenu[5].getNama().equals(nama)) {
            return daftarMenu[5];
        }
        if (daftarMenu[6].getNama().equals(nama)) {
            return daftarMenu[6];
        }
        if (daftarMenu[7].getNama().equals(nama)) {
            return daftarMenu[7];
        }
        return null;
    }

    // Method untuk memproses dan mencetak struk pembayaran
    private static void prosesStrukPembayaran(String[] namaPesanan, int[] jumlahPesanan) {
        System.out.println("\n\n==============================================");
        System.out.println("              STRUK PEMBAYARAN");
        System.out.println("==============================================");
        System.out.println("Item Pesanan:");
        System.out.println("----------------------------------------------");

        // Array untuk menyimpan informasi pesanan
        Menu[] menuPesanan = new Menu[4];
        int[] totalPerItem = new int[4];
        int totalBiaya = 0;

        // Proses pesanan pertama
        if (namaPesanan[0] != null) {
            menuPesanan[0] = cariMenu(namaPesanan[0]);
            if (menuPesanan[0] != null) {
                totalPerItem[0] = menuPesanan[0].getHarga() * jumlahPesanan[0];
                System.out.printf("%s\n", menuPesanan[0].getNama());
                System.out.printf("  %d x Rp %,d = Rp %,d\n", jumlahPesanan[0], menuPesanan[0].getHarga(), totalPerItem[0]);
                totalBiaya += totalPerItem[0];
            }
        }

        // Proses pesanan kedua
        if (namaPesanan[1] != null) {
            menuPesanan[1] = cariMenu(namaPesanan[1]);
            if (menuPesanan[1] != null) {
                totalPerItem[1] = menuPesanan[1].getHarga() * jumlahPesanan[1];
                System.out.printf("%s\n", menuPesanan[1].getNama());
                System.out.printf("  %d x Rp %,d = Rp %,d\n", jumlahPesanan[1], menuPesanan[1].getHarga(), totalPerItem[1]);
                totalBiaya += totalPerItem[1];
            }
        }

        // Proses pesanan ketiga
        if (namaPesanan[2] != null) {
            menuPesanan[2] = cariMenu(namaPesanan[2]);
            if (menuPesanan[2] != null) {
                totalPerItem[2] = menuPesanan[2].getHarga() * jumlahPesanan[2];
                System.out.printf("%s\n", menuPesanan[2].getNama());
                System.out.printf("  %d x Rp %,d = Rp %,d\n", jumlahPesanan[2], menuPesanan[2].getHarga(), totalPerItem[2]);
                totalBiaya += totalPerItem[2];
            }
        }

        // Proses pesanan keempat
        if (namaPesanan[3] != null) {
            menuPesanan[3] = cariMenu(namaPesanan[3]);
            if (menuPesanan[3] != null) {
                totalPerItem[3] = menuPesanan[3].getHarga() * jumlahPesanan[3];
                System.out.printf("%s\n", menuPesanan[3].getNama());
                System.out.printf("  %d x Rp %,d = Rp %,d\n", jumlahPesanan[3], menuPesanan[3].getHarga(), totalPerItem[3]);
                totalBiaya += totalPerItem[3];
            }
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Subtotal               : Rp %,d\n", totalBiaya);

        // Cek penawaran beli 1 gratis 1 untuk minuman jika total > 50.000
        int potonganMinuman = 0;
        String minumanGratis = "";
        if (totalBiaya > 50000) {
            // Cari minuman dengan harga tertinggi untuk promo
            int hargaMinumanTertinggi = 0;
            if (menuPesanan[0] != null && menuPesanan[0].getKategori().equals("Minuman")) {
                if (menuPesanan[0].getHarga() > hargaMinumanTertinggi) {
                    hargaMinumanTertinggi = menuPesanan[0].getHarga();
                    minumanGratis = menuPesanan[0].getNama();
                }
            }
            if (menuPesanan[1] != null && menuPesanan[1].getKategori().equals("Minuman")) {
                if (menuPesanan[1].getHarga() > hargaMinumanTertinggi) {
                    hargaMinumanTertinggi = menuPesanan[1].getHarga();
                    minumanGratis = menuPesanan[1].getNama();
                }
            }
            if (menuPesanan[2] != null && menuPesanan[2].getKategori().equals("Minuman")) {
                if (menuPesanan[2].getHarga() > hargaMinumanTertinggi) {
                    hargaMinumanTertinggi = menuPesanan[2].getHarga();
                    minumanGratis = menuPesanan[2].getNama();
                }
            }
            if (menuPesanan[3] != null && menuPesanan[3].getKategori().equals("Minuman")) {
                if (menuPesanan[3].getHarga() > hargaMinumanTertinggi) {
                    hargaMinumanTertinggi = menuPesanan[3].getHarga();
                    minumanGratis = menuPesanan[3].getNama();
                }
            }

            if (hargaMinumanTertinggi > 0) {
                potonganMinuman = hargaMinumanTertinggi;
                System.out.printf("Promo Beli 1 Gratis 1  : -Rp %,d\n", potonganMinuman);
                System.out.printf("  (Gratis 1 %s)\n", minumanGratis);
                totalBiaya -= potonganMinuman;
            }
        }

        // Hitung pajak 10%
        int pajak = totalBiaya * 10 / 100;
        System.out.printf("Pajak (10%%)            : Rp %,d\n", pajak);

        // Biaya pelayanan
        int biayaPelayanan = 20000;
        System.out.printf("Biaya Pelayanan        : Rp %,d\n", biayaPelayanan);

        // Total sebelum diskon
        int totalSebelumDiskon = totalBiaya + pajak + biayaPelayanan;

        // Cek diskon 10% jika total > 100.000
        int diskon = 0;
        if (totalSebelumDiskon > 100000) {
            diskon = totalSebelumDiskon * 10 / 100;
            System.out.println("----------------------------------------------");
            System.out.printf("Total                  : Rp %,d\n", totalSebelumDiskon);
            System.out.printf("Diskon (10%%)           : -Rp %,d\n", diskon);
        }

        // Total akhir
        int totalAkhir = totalSebelumDiskon - diskon;
        System.out.println("==============================================");
        System.out.printf("TOTAL PEMBAYARAN       : Rp %,d\n", totalAkhir);
        System.out.println("==============================================");

        // Tampilkan informasi promo yang didapat
        if (potonganMinuman > 0 || diskon > 0) {
            System.out.println("\n*** SELAMAT! Anda mendapat promo: ***");
            if (potonganMinuman > 0) {
                System.out.println("- Beli 1 Gratis 1 untuk minuman");
            }
            if (diskon > 0) {
                System.out.println("- Diskon 10% untuk pembelian > Rp 100.000");
            }
        }

        System.out.println("\n   Terima kasih atas kunjungan Anda!");
        System.out.println("==============================================");
    }
}