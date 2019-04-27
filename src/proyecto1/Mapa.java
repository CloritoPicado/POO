/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Francisco
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {
    private List<CoordenadasVehiculo> coordenadas = new ArrayList<>();
    
    public MyCanvas(List<CoordenadasVehiculo> coordenadas) {
        this.coordenadas = coordenadas;
        
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Image img1 = Toolkit.getDefaultToolkit().getImage("Imagenes/MapaCostaRica/mapaCR.png");
        g2.drawImage(img1, 0, 0, this);
        g2.finalize();
        int x1 = coordenadas.get(0).getLatitud();
        int y1 = coordenadas.get(0).getLongitud();
        for (int i = 1; i < coordenadas.size()+1; i++){
            int x2 = coordenadas.get(i).getLatitud();
            int y2 = coordenadas.get(i).getLongitud();
            g2.drawLine(x1, y1, x2, y2);
            g2.drawRoundRect(x1-10, y1-10, 20, 20, 5, 5);
            g2.drawRoundRect(x2-10, y2-10, 20, 20, 5, 5);
            x1 = x2;
            y1 = y2;
        }
        g2.finalize();
    }
}


public class Mapa {
    public static void main(String[] a) {
        List<CoordenadasVehiculo> nuevoCoordenadas = new ArrayList<>();
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 1049, 816);
        window.getContentPane().add(new MyCanvas(nuevoCoordenadas));
        window.setVisible(true);
        
    
    
    
    
    
    
    
    
    
    
    
  }
}


