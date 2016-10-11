/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitements;

import Entites.*;
import java.io.*;
import static toutbois.Application.c;
import static toutbois.Application.p;


/**
 *
 * @author ajugnon
 * sources jpaul
 */
public class Fichiers {
    /**
     * 
     * Récupère le nom du fichier à lire et écrire
     */
    public static String nomfic;
    
    /**
     * Méthode servant a lire le fichier passé en paramètre
     * et ajoute les données dans la collection @c
     * Peut lever une exception IOException si problème de lecture
     * Peut lever une exception NumberFormatException si lors de la saisie on inscrit autre chose
     * que des chiffres dans les champs Tel,NumRep,NbCom
     * @param typefic récupére le type de fichier Client, Représentant ou Prospect
     * @param nomfic récupère le nom du fichier à lire
     */
    public static void ouvrir_fichier(char typefic, String nomfic) 
    { 

        try
        { 
            InputStream ips = new FileInputStream(nomfic); 
            InputStreamReader ipsr = new InputStreamReader(ips); 
            try (BufferedReader br = new BufferedReader(ipsr)) {
                String ligne;
                int numLigne = 0;
                

                while ((ligne = br.readLine()) != null)
                {
                    numLigne++;
                    //System.out.println(ligne);
                    String[] splitArray = ligne.split(";");
                    
                    switch (typefic)
                    {
                        case 'C':
                            Client cli = new Client();
                            numLigne = Integer.parseInt(splitArray[0]);
                            cli.setNumCli(numLigne);
                            cli.setEnseigne(splitArray[1]);
                            cli.setVille(splitArray[2]);
                            cli.setTel(Integer.parseInt(splitArray[3]));
                            cli.setNumRep(Integer.parseInt(splitArray[4]));
                            cli.setNbCom(Integer.parseInt(splitArray[5]));
                            c.add(cli);
                            break;
                        case 'P':
                            Prospect pro = new Prospect();
                            pro.setCompAdd(splitArray[0]);
                            pro.setDerniereVisite(splitArray[1]);
                            pro.setEnseigne(splitArray[2]);
                            pro.setMail(splitArray[3]);
                            pro.setPays(splitArray[4]);
                            pro.setRue(splitArray[5]);
                            pro.setVille(splitArray[6]);
                            pro.setVoie(splitArray[7]);
                            pro.setCedex(Integer.parseInt(splitArray[8]));
                            pro.setCp(Integer.parseInt(splitArray[9]));
                            pro.setNumRue(Integer.parseInt(splitArray[10]));
                            pro.setSiret(Integer.parseInt(splitArray[11]));
                            pro.setTel(Integer.parseInt(splitArray[12]));
                            p.add(pro);
                            break;
                    }
                }
                Client.setCptNumCli(numLigne);
            }
        } 
        catch (IOException | NumberFormatException e)
        { 
            System.out.println(e.toString()); 
        } 

    }
    
    /**
     * Permet de fermer le fichier et d'enregistrer les données en fonction du type de fichier passé en paramètre
     * 
     * @param typefic soit Client,Prospect ou Représentant
     * @param nomfic récupere le nom du fichier
     * @throws IOException Peut lever une exception IOException
     */
    public static void fermer_fichier(char typefic, String nomfic) throws IOException 
    { 
        File nomFichier;
        
        String mycontent;
      
        nomFichier = new File(nomfic);
        
        if (! nomFichier.exists())
        {
            nomFichier.createNewFile();
            // tu crées le fichier texte ici par le biais d'un FileWriter par exemple
        }
        try
        {
            PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter (nomFichier)));
            switch (typefic)
                {
                    case 'C':
                        for(int i = 0 ; i < c.size(); i++)
                        {
                            Client monCli = c.get(i);
                            mycontent = monCli.getNumCli()+";"+monCli.getEnseigne()+";"+monCli.getVille()+";"+monCli.getTel()+";"+monCli.getNumRep()+";"+monCli.getNbCom();
                            pw.println (mycontent);
                        }
                        pw.close();
                        break;
                    
                    case 'P':
                        for(int i = 0; i < p.size(); i++){
                            Prospect monPro = p.get(i);
                            mycontent = monPro.getCompAdd()+";"+monPro.getDerniereVisite()+";"+monPro.getEnseigne()+";"+monPro.getMail()+";"+monPro.getPays()+";"+monPro.getRue()+";"+monPro.getVille()+";"+monPro.getVoie()+";"+monPro.getCedex()+";"+monPro.getCp()+";"+monPro.getNumRue()+";"+monPro.getSiret()+";"+monPro.getTel();
                            pw.println(mycontent);
                        }
                        pw.close();
                        break;
                }
        }
        catch (IOException exception)
        {
            System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
        }
        
        
            
    }
    
}
