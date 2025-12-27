/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sz.util;

/**
 *
 * @author ADVAN
 */
public class Produk {
    private static int id_produk;
    private static String nama_produk;
    private static int ukuran;
    private static int harga;
    private static int stok;

    public static void setIdp(int idp) {
        Produk.id_produk = idp;
    }

    public static void setProduk(String produk) {
        Produk.nama_produk = produk;
    }
    
    public static void setUk(int uk) {
        Produk.ukuran = uk;
    }
    
    public static void setHrg(int hrg) {
        Produk.harga = hrg;
    }

    public static void setStk(int stk) {
        Produk.stok = stk;
    }
    // 3. GETTER (untuk MENGAMBIL data dari loker)
    // Ini akan dipanggil dari Profile.java (atau form lain)
    
    public static int getIdp() {
        return id_produk;
    }

    public static String getProduk() {
        return nama_produk;
    }

    public static int getUk() {
        return ukuran;
    }
    
    public static int getHrg() {
        return harga;
    }
    
    public static int getStk(){
        return stok;
    }
}
