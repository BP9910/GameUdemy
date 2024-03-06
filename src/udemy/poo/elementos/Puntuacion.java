/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.elementos;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JPanel;
import udemy.poo.interfaz.Actions;
import udemy.poo.modelo.Burbuja;

/**
 *
 * @author Ingenian Software
 */
public class Puntuacion implements Actions{
    private JPanel panel;
    private int nave = 0;
    private int orbe = 0;

    public Puntuacion(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void pintar(Graphics2D g) {
        g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        g.drawString("nave" + nave, 0, 20);
        g.drawString("orbe" + orbe, 700, 20);
    }

    @Override
    public void teclado(KeyEvent e) {
    }

    @Override
    public void raton(MouseEvent e) {
    }

    @Override
    public void calculo() {
        burbujas Burbujas = burbujas.getburbujas();
        if (Burbujas.getElementos().size() > 1){
            for (Burbuja elemento : Burbujas.getElementos()) {
                if(elemento.getWhoDeleted().equals("nave")){
                    nave += 1;
                }else if (elemento.getWhoDeleted().equals("orbe")){
                    orbe +=1;
                }
            }
            
            Iterator iterador = Burbujas.getElementos().iterator();
            
            while(iterador.hasNext()){
                Burbuja objeto = (Burbuja) iterador.next();
                if (objeto.isEliminar()){
                    iterador.remove();
                }
            }
        }else{
            Burbujas.configurar(this.panel, "orbe.png");
        }
    }
    
}
