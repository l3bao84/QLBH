/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author HELLO
 */
public class Users {
    private String username;
    private String password;
    private NhanVien nv;

    public Users() {
    }

    public Users(String username, String password, NhanVien nv) {
        this.username = username;
        this.password = password;
        this.nv = nv;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public NhanVien getManv() {
        return nv;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setManv(NhanVien nv) {
        this.nv = nv;
    }

    @Override
    public String toString() {
        return "Users{" + "username=" + username + ", password=" + password + ", nv=" + nv + '}';
    }  
    
}
