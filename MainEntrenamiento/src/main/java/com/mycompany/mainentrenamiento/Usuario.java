
package com.mycompany.mainentrenamiento;

public class Usuario {
    private String usuario;
    private int contrasena;

    public Usuario(String usuario, int contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
