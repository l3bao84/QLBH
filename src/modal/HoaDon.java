/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author HELLO
 */
public class HoaDon {
    private String mahd;
    private KhanhHang khanhHang;
    private NhanVien nhanVien;
    private String ngaylap;

    public HoaDon() {
    }

    public HoaDon(String mahd, KhanhHang khanhHang, NhanVien nhanVien, String ngaylap) {
        this.mahd = mahd;
        this.khanhHang = khanhHang;
        this.nhanVien = nhanVien;
        this.ngaylap = ngaylap;
    }

    public String getMahd() {
        return mahd;
    }

    public KhanhHang getKhanhHang() {
        return khanhHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public void setKhanhHang(KhanhHang khanhHang) {
        this.khanhHang = khanhHang;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "mahd=" + mahd + ", khanhHang=" + khanhHang + ", nhanVien=" + nhanVien + ", ngaylap=" + ngaylap + '}';
    }

    
}
