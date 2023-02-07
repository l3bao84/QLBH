/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.SanPham_dao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modal.SanPham;
import view.PJView;

/**
 *
 * @author HELLO
 */
public class PJViewController implements ActionListener{
    
    private PJView pjView;
    private static int currentIndex = 0;

    public PJViewController(PJView pjView) {
        this.pjView = pjView;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<SanPham> listSP = SanPham_dao.getInstance().selectAll();
        
        String source = e.getActionCommand();
        if(source.equals("Tiếp")) {
            if(currentIndex != listSP.size() - 1) {
                currentIndex++;
            }
            this.pjView.getProInforFromDB(currentIndex);
        }else if(source.equals("Trước đó")) {
            if(currentIndex != 0) {
                currentIndex--;
            }
            this.pjView.getProInforFromDB(currentIndex);
        }
    }
    
}
