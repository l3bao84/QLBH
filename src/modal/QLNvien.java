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
public class QLNvien {
    private ArrayList<NhanVien> listNV;

    public QLNvien() {
    }

    public QLNvien(ArrayList<NhanVien> listNV) {
        this.listNV = listNV;
    }

    public ArrayList<NhanVien> getListNV() {
        return listNV;
    }

    public void setListNV(ArrayList<NhanVien> listNV) {
        this.listNV = listNV;
    }
    
    public void insert(NhanVien nhanVien) {
        this.listNV.add(nhanVien);
    }
    
    public void del(NhanVien nhanVien) {
        this.listNV.remove(nhanVien);
    }
}
