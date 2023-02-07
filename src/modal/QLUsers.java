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
public class QLUsers {
    private ArrayList<Users> listUsers;

    public QLUsers() {
    }

    public QLUsers(ArrayList<Users> listUsers) {
        this.listUsers = listUsers;
    }

    public ArrayList<Users> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<Users> listUsers) {
        this.listUsers = listUsers;
    }
    
    public void insert(Users users) {
        this.listUsers.add(users);
    }
    
    public void del(Users users) {
        this.listUsers.remove(users);
    }
}
