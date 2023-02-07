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
public class QLSpham {
    private ArrayList<SanPham> listSP;

    public QLSpham() {
        this.listSP = new ArrayList<>();
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void setListSP(ArrayList<SanPham> listSP) {
        this.listSP = listSP;
    }
    
    public void insert(SanPham sp) {
        this.listSP.add(sp);
    }
    
    public void del(SanPham sp) {
        this.listSP.remove(sp);
    }
}
