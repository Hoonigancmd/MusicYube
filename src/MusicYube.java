/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicyube;
import javax.swing.SwingUtilities;
/**
 *
 * @author TokDeLokTo
 */
public class MusicYube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> new Playlist().setVisible(true));
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
        FileMusik fm = new FileMusik("C:/Music/lagu.wav", 1);
        System.out.println("Testing: " + fm.toString());
        System.out.println("Format valid: " + fm.isFormatValid());
    }
    
}
