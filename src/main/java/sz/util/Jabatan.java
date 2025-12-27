/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sz.util;

/**
 *
 * @author ADVAN
 */
public class Jabatan {
    private static int id_jabatan;
    private static String nama_jabatan;
    private static String gaji_pokok;
   
    
    // (Anda bisa tambah variabel lain jika perlu)


    // 2. SETTER (untuk MENYIMPAN data ke loker)
    // Ini akan dipanggil dari LoginPage.java
    
    public static void setIJb(int ijb) {
        Jabatan.id_jabatan = ijb;
    }

    public static void setJbname(String jbn) {
        Jabatan.nama_jabatan = jbn;
    }

    public static void setGp(String gp) {
        Jabatan.gaji_pokok = gp;
    }
    

    // 3. GETTER (untuk MENGAMBIL data dari loker)
    // Ini akan dipanggil dari Profile.java (atau form lain)
    
    public static int getIJd() {
        return id_jabatan;
    }

    public static String getJbName() {
        return nama_jabatan;
    }

    public static String getGp() {
        return gaji_pokok;
    }
}
