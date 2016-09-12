/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SERVIDOR
 */
public class Password {
    private String contraseña;
    private int longitud=8;
    
    public Password (String contraseña,int longitud){
        this.contraseña=contraseña;
        this.longitud=longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setContraseña(String Contraseña) {
        this.contraseña = Contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public Password cambiarc (){
        Password con;
        String c;
        int l;
        c = this.contraseña;
        l = this.longitud;
        con = new Password (c,l);
        return con;
    }
    public String contraseñaf (){
        String contf;
         if (this.longitud>6){
             contf= "La contraseña es buena";
         } else{
             contf="La contraseña es debil";
         }
         return contf;
    }
    public Password mostcont (){
        Password mcont;
        String c;
        int l;
        c =this.contraseña;
        l=this.longitud;
        
        mcont= new Password (c,l);
        return mcont;
    }
    
}
