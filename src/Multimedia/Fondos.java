/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multimedia;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Pedro
 */
public class Fondos extends javax.swing.JPanel{
    private Image imagen;
    private String ruta;
    
    public Fondos(String ruta, int w, int h){
        setSize(w, h);
        this.ruta=ruta;
    }
    @Override
    public void paint(Graphics g){        
        imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }    
}
