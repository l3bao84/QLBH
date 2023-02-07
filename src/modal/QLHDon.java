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
public class QLHDon {
    private ArrayList<HoaDon> listHD;

    public QLHDon() {
    }

    public QLHDon(ArrayList<HoaDon> listHD) {
        this.listHD = listHD;
    }

    public ArrayList<HoaDon> getListHD() {
        return listHD;
    }

    public void setListHD(ArrayList<HoaDon> listHD) {
        this.listHD = listHD;
    }
   
    public void insert(HoaDon hoaDon) {
        this.listHD.add(hoaDon);
    }
    
    public void del(HoaDon hoaDon) {
        this.listHD.remove(hoaDon);
    }
}
