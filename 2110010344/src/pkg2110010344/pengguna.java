/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010344;

/**
 *
 * @author ASUS
 */
 class pengguna {
     private String user;
     private String password;
     private String level;
     
     public pengguna (String user, String password, String level){
         this.user=user;
         this.password=password;
         this.level=level;
     }
     
    public String getuser(){
        return user;
    }
    public void setuser(){
        this.user=user;
    }
    
    public String getpassword(){
        return password;
    }
    public void setpassword(){
        this.password=password;
    }
    
    public String getlevel(){
        return level;
    }
    public void setlevel(){
        this.level=level;
    }
}
