/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import database.ConnectionDB;
import java.sql.Connection;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginFormPJ;
import view.PJView;

/**
 *
 * @author HELLO
 */
public class Run {
    public static void main(String[] args) {	
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new PJView();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(date.getDate());
//        System.out.println(date.getMonth() + 1);
//        System.out.println(date.getYear() + 1900);
//        System.out.println(date);
    }
}
