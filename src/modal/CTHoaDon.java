/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author HELLO
 */
public class CTHoaDon {
    private HoaDon hoaDon;
    private SanPham sanPham;
    private int soluong;
    private float tongtien;

    public CTHoaDon() {
    }

    public CTHoaDon(HoaDon hoaDon, SanPham sanPham, int soluong, float tongtien) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.soluong = soluong;
        this.tongtien = tongtien;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return "CTHoaDon{" + "hoaDon=" + hoaDon + ", sanPham=" + sanPham + ", soluong=" + soluong + ", tongtien=" + tongtien + '}';
    }
}
