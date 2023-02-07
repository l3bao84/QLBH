/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.ArrayList;

/**
 *
 * @author HELLO
 */
public class QLKhang {
    private ArrayList<KhanhHang> listKH;

    public QLKhang() {
    }

    public QLKhang(ArrayList<KhanhHang> listKH) {
        this.listKH = listKH;
    }

    public ArrayList<KhanhHang> getListKH() {
        return listKH;
    }

    public void setListKH(ArrayList<KhanhHang> listKH) {
        this.listKH = listKH;
    }
    
    public void insert(KhanhHang khanhHang) {
        this.listKH.add(khanhHang);
    }
    
    public void del(KhanhHang khanhHang) {
        this.listKH.remove(khanhHang);
    }
}
