/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toutbois;

import Entites.*;
import IHM.*;
import Traitements.*;
import static Traitements.Bdds.lireBdd;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author ajugnon
 */
public class Application {
    public static List<Client> c = new ArrayList<>();
    public static List<Prospect> p = new ArrayList<>();

    public Application() {
        FenetrePrincipale fp = new FenetrePrincipale();
        fp.setVisible(true);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
            Fichiers.ouvrir_fichier('C', "Client.txt");
            for(int i = 0 ; i < c.size(); i++)
            {
                Client monCli = c.get(i);
                //System.out.println("Numero = "+monCli.getNumCli()+" Enseigne = "+monCli.getEnseigne()+" Ville = "+monCli.getVille());
            }
            
            /*Fichiers.ouvrir_fichier('P', "Prospect.txt");
            for(int i = 0; i <p.size(); i++){
                Prospect monPro = p.get(i);
            }*/
            lireBdd('P', "Prospect");
            
            
           
		/*UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);*/
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
                Application application = new Application();
                }
    
}
