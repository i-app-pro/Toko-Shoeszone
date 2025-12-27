package sz.panel;

public class Pegawai {
    private int id_pegawai;
    private String nama_pegawai;
    private String jabatan;
    private String username_p;
    private String password_hash;

    public int getIdp() {
        return id_pegawai;
    }

    public void setIdp(int idp) {
        this.id_pegawai = idp;
    }

    public String getNp() {
        return nama_pegawai;
    }

    public void setNp(String np) {
        this.nama_pegawai = np;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getUnam() {
        return username_p;
    }

    public void setUnam(String unam) {
        this.username_p = unam;
    }

    public String getPgw() {
        return password_hash;
    }

    public void setPgw(String pgw) {
        this.password_hash = pgw;
    }
}
