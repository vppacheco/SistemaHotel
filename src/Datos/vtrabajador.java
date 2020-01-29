/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author victo
 */
public class vtrabajador extends vpersona{
    private Double sueldo;
    private String acceso;
    private String login;
    private String passwords;
    private String estado;

    public vtrabajador() {
    }

    public vtrabajador(Double sueldo, String acceso, String login, String passwords, String estado) {
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.passwords = passwords;
        this.estado = estado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
