/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author HELLO
 */
public class SanPham {
    private String masp;
    private String tensp;
    private String donvitinh;
    private float dongia;
    private int soluong;
    private String url;

    public SanPham() {
    }

    public SanPham(String masp, String tensp, String donvitinh, float dongia, int soluong, String url) {
        this.masp = masp;
        this.tensp = tensp;
        this.donvitinh = donvitinh;
        this.dongia = dongia;
        this.soluong = soluong;
        this.url = url;
    }

    public String getMasp() {
        return masp;
    }

    public String getTensp() {
        return tensp;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public float getDongia() {
        return dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", donvitinh=" + donvitinh + ", dongia=" + dongia + ", soluong=" + soluong + '}';
    }
    
    
}
