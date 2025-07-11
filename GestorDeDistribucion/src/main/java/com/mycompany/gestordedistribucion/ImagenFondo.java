
package com.mycompany.gestordedistribucion;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel{
    private Image imagen;
    private ImageIcon imagenIcono;
    
    public ImagenFondo(String ruta){
        imagenIcono = new ImageIcon(ruta);
    }
    public void paintComponent(Graphics g){
        imagen = imagenIcono.getImage();
        
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
        setOpaque(false);
        
        super.paintComponent(g);
    }
}
