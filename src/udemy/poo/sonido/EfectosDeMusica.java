/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.sonido;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Ingenian Software
 */
public class EfectosDeMusica implements Runnable{
    private BufferedInputStream buffer = null;
    private FileInputStream archivo;
    private Player player = null;

    public EfectosDeMusica(String archivo) {
        try {
            this.archivo = new FileInputStream(this.getClass().getResource("/udemy/poo/musica/" + archivo).toURI().getPath());
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    
    @Override
    public void run() {
        buffer = new BufferedInputStream(this.archivo);
        try {
            player = new Player(archivo);
            player.play();
        } catch (JavaLayerException ex) {
            ex.printStackTrace();
        }
    }
    
}
